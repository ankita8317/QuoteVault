package com.example.quotevault

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.quotevault.ui.auth.LoginScreen
import com.example.quotevault.ui.favorites.FavoritesScreen
import com.example.quotevault.ui.home.HomeScreen
import com.example.quotevault.ui.theme.GreenDark
import com.example.quotevault.ui.theme.QuoteVaultTheme
import com.example.quotevault.ui.theme.WhiteText
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            QuoteVaultTheme {

                var isLoggedIn by remember { mutableStateOf(false) }
                var selectedTab by remember { mutableIntStateOf(0) }

                if (!isLoggedIn) {
                    LoginScreen(onLoginSuccess = { isLoggedIn = true })
                } else {
                    Scaffold(
                        bottomBar = {
                            NavigationBar(
                                containerColor = GreenDark,
                                tonalElevation = 8.dp
                            ) {
                                NavigationBarItem(
                                    selected = selectedTab == 0,
                                    onClick = { selectedTab = 0 },
                                    icon = { Text("🏠") },
                                    label = { Text("Home", color = WhiteText) }
                                )
                                NavigationBarItem(
                                    selected = selectedTab == 1,
                                    onClick = { selectedTab = 1 },
                                    icon = { Text("❤️") },
                                    label = { Text("Favorites", color = WhiteText) }
                                )
                            }
                        }
                    ) { padding ->
                        Box(modifier = Modifier.padding(padding)) {
                            when (selectedTab) {
                                0 -> HomeScreen()
                                1 -> FavoritesScreen()
                            }
                        }
                    }
                }
            }
        }
    }
}



