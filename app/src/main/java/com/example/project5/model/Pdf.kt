package com.example.project5.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Pdf(
    val acsTokenLink: String = "",
    val isAvailable: Boolean = false,
    @SerialName("downloadLink") val downloadUrl: String? = null
)