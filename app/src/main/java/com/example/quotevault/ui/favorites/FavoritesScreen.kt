package com.example.quotevault.ui.favorites

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quotevault.data.QuoteRepository
import com.example.quotevault.ui.home.QuoteCard
import com.example.quotevault.ui.theme.GreenBackground
import com.example.quotevault.ui.theme.WhiteText

@Composable
fun FavoritesScreen() {

    val favorites = QuoteRepository.getFavorites()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(GreenBackground)
            .padding(16.dp)
    ) {

        Text(
            text = "Favorites ❤️",
            style = MaterialTheme.typography.headlineLarge,
            color = WhiteText
        )

        Spacer(modifier = Modifier.height(16.dp))

        if (favorites.isEmpty()) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("❤️", fontSize = 48.sp)
                Spacer(modifier = Modifier.height(12.dp))
                Text("No favorites yet", color = WhiteText)
            }
        } else {
            LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                items(favorites) { quote ->
                    QuoteCard(
                        quote = quote,
                        onFavoriteClick = {
                            QuoteRepository.toggleFavorite(quote.id)
                        }
                    )
                }
            }
        }
    }
}


