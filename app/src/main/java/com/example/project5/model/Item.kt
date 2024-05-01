package com.example.project5.model

import kotlinx.serialization.Serializable

@Serializable
data class Item(
    val accessInfo: AccessInfo = AccessInfo(),
    val etag: String = "",
    val id: String ="",
    val kind: String ="",
    val saleInfo: SaleInfo,
    val searchInfo: SearchInfo =SearchInfo(),
    val selfLink: String ="",
    val volumeInfo: VolumeInfo = VolumeInfo()
){
    fun doesMatchSearchQuery(q: String): Boolean{
        val matchingCombination = listOf(
            "${volumeInfo.title.first()}",
            "${volumeInfo.title.last()}"
        )
        return  matchingCombination.any(){
            it.contains(q, ignoreCase = true)
        }
    }
}