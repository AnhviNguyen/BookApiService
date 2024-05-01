package com.example.project5.model

import kotlinx.serialization.Serializable

@Serializable
data class ListPriceX(
    val amountInMicros: Long = 0L,
    val currencyCode: String = ""
)