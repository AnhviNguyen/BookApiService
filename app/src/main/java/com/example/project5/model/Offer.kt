package com.example.project5.model

import kotlinx.serialization.Serializable

@Serializable
data class Offer(
    val finskyOfferType: Int = 0,
    val listPrice: ListPriceX = ListPriceX(),
    val retailPrice: RetailPrice = RetailPrice()
)