package com.example.quotevault.ui.home

import android.content.Intent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.quotevault.model.Quote
import com.example.quotevault.ui.theme.GreenDark
import com.example.quotevault.ui.theme.WhiteText

@Composable
fun QuoteCard(
    quote: Quote,
    onFavoriteClick: () -> Unit
) {
    val context = LocalContext.current

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = GreenDark)
    ) {
        Column(modifier = Modifier.padding(20.dp)) {

            Text(
                text = "“${quote.text}”",
                color = WhiteText,
                style = MaterialTheme.typography.bodyLarge
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "- ${quote.author}",
                color = WhiteText.copy(alpha = 0.8f),
                style = MaterialTheme.typography.bodyMedium
            )

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically
            ) {

                // Share
                IconButton(onClick = {
                    val intent = Intent(Intent.ACTION_SEND).apply {
                        type = "text/plain"
                        putExtra(
                            Intent.EXTRA_TEXT,
                            "\"${quote.text}\"\n\n- ${quote.author}\n\nShared via QuoteVault"
                        )
                    }
                    context.startActivity(
                        Intent.createChooser(intent, "Share Quote")
                    )
                }) {
                    Icon(
                        imageVector = Icons.Filled.Share,
                        contentDescription = "Share",
                        tint = WhiteText
                    )
                }

                // Favorite
                IconButton(onClick = onFavoriteClick) {
                    Icon(
                        imageVector = if (quote.isFavorite)
                            Icons.Filled.Favorite
                        else
                            Icons.Filled.FavoriteBorder,
                        contentDescription = "Favorite",
                        tint = WhiteText
                    )
                }
            }
        }
    }
}
