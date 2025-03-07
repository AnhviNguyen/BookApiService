package com.example.project5.model

import kotlinx.serialization.Serializable

@Serializable
data class AccessInfo(
    val accessViewStatus: String = "",
    val country: String = "",
    val embeddable: Boolean = false,
    val epub: Epub = Epub(),
    val pdf: Pdf = Pdf(),
    val publicDomain: Boolean = false,
    val quoteSharingAllowed: Boolean = false,
    val textToSpeechPermission: String = "",
    val viewability: String = "",
    val webReaderLink: String = ""
)