package com.example.project5.network

import com.example.project5.model.Book
import com.example.project5.model.Item
import retrofit2.http.GET
import retrofit2.http.Query


interface BookApiService {
    @GET("volumes")
    suspend fun getBooks(@Query("q") query: String): Book
}