package com.example.quotevault.data

import com.example.quotevault.model.Quote

object QuoteRepository {

    private val quotes = mutableListOf(
        Quote(1, "Believe in yourself", "Ralph Waldo Emerson", "Motivation"),
        Quote(2, "Dream big", "Norman Vaughan", "Motivation"),
        Quote(3, "Stay hungry, stay foolish", "Steve Jobs", "Success"),
        Quote(4, "Life is what happens when you're busy making plans", "John Lennon", "Life"),
        Quote(5, "Simplicity is the ultimate sophistication", "Leonardo da Vinci", "Wisdom")
    )

    fun getQuotes(): List<Quote> = quotes

    fun toggleFavorite(id: Int) {
        quotes.find { it.id == id }?.let {
            it.isFavorite = !it.isFavorite
        }
    }

    fun getFavorites(): List<Quote> =
        quotes.filter { it.isFavorite }
}
