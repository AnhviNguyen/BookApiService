package com.example.project5.model

import kotlinx.serialization.Serializable

@Serializable
data class SearchInfo(
    val textSnippet: String = ""
)