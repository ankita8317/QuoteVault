package com.example.quotevault.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.quotevault.data.DailyQuoteManager
import com.example.quotevault.data.QuoteRepository
import com.example.quotevault.ui.theme.GreenBackground
import com.example.quotevault.ui.theme.WhiteText

@Composable
fun HomeScreen() {

    val quotes = remember { QuoteRepository.getQuotes() }
    val dailyQuote = remember { DailyQuoteManager.getDailyQuote() }
    var searchQuery by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(GreenBackground)
            .padding(16.dp)
    ) {

        // Header
        Text(
            text = "QuoteVault",
            style = MaterialTheme.typography.headlineLarge,
            color = WhiteText
        )
        Text(
            text = "Daily inspiration for you 💚",
            style = MaterialTheme.typography.bodyMedium,
            color = WhiteText.copy(alpha = 0.8f)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Daily Quote
        Text(
            text = "🌟 Quote of the Day",
            style = MaterialTheme.typography.titleLarge,
            color = WhiteText
        )

        Spacer(modifier = Modifier.height(8.dp))

        QuoteCard(
            quote = dailyQuote,
            onFavoriteClick = {
                QuoteRepository.toggleFavorite(dailyQuote.id)
            }
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Search
        OutlinedTextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            placeholder = {
                Text(
                    "Search by quote or author",
                    color = WhiteText.copy(alpha = 0.7f)
                )
            },
            modifier = Modifier.fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = WhiteText,
                unfocusedBorderColor = WhiteText.copy(alpha = 0.6f),
                focusedTextColor = WhiteText,
                unfocusedTextColor = WhiteText
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Quote list
        LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            items(
                quotes.filter {
                    it.text.contains(searchQuery, true) ||
                            it.author.contains(searchQuery, true)
                }
            ) { quote ->
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














