package com.example.project5.model

import kotlinx.serialization.Serializable

@Serializable
data class Book(
    val items: List<Item> =  emptyList(),
    val kind: String ="",
    val totalItems: Int =0
)