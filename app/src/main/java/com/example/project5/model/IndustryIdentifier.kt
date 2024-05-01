package com.example.project5.model

import kotlinx.serialization.Serializable

@Serializable
data class IndustryIdentifier(
    val identifier: String = "",
    val type: String = ""
)