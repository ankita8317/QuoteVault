package com.example.quotevault.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

private val AppColorScheme = darkColorScheme(
    primary = GreenPrimary,
    background = GreenBackground,
    surface = GreenBackground,
    onPrimary = WhiteText,
    onBackground = WhiteText,
    onSurface = WhiteText
)

@Composable
fun QuoteVaultTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = AppColorScheme,
        content = content
    )
}

