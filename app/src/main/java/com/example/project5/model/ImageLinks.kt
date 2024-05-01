package com.example.project5.model

import kotlinx.serialization.Serializable

@Serializable
data class ImageLinks(
    val smallThumbnail: String = "",
    val thumbnail: String = ""
)