package com.example.project5.model

import kotlinx.serialization.Serializable

@Serializable
data class ReadingModes(
    val image: Boolean = false,
    val text: Boolean = false
)