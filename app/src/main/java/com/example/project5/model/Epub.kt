package com.example.project5.model

import kotlinx.serialization.Serializable

@Serializable
data class Epub(
    val acsTokenLink: String = "",
    val downloadLink: String ="",
    val isAvailable: Boolean =false
)