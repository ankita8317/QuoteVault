package com.example.quotevault.data

import com.example.quotevault.model.Quote
import java.util.Calendar

object DailyQuoteManager {

    fun getDailyQuote(): Quote {
        val quotes = QuoteRepository.getQuotes()

        val calendar = Calendar.getInstance()
        val dayOfYear = calendar.get(Calendar.DAY_OF_YEAR)

        return quotes[dayOfYear % quotes.size]
    }
}
