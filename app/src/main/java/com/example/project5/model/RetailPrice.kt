package com.example.project5.model

import kotlinx.serialization.Serializable

@Serializable
data class RetailPrice(
    val amountInMicros: Long = 0L,
    val currencyCode: String = ""
)