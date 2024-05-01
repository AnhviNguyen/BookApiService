package com.example.project5.model

import kotlinx.serialization.Serializable

@Serializable
data class ListPrice(
    val amount: Int =0,
    val currencyCode: String =""
)