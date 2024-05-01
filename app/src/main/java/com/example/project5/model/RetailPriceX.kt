package com.example.project5.model

import kotlinx.serialization.Serializable

@Serializable
data class RetailPriceX(
    val amount: Int =0,
    val currencyCode: String =""
)