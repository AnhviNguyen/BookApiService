package com.example.project5.data

import com.example.project5.model.Book
import com.example.project5.model.Item
import com.example.project5.network.BookApiService
import retrofit2.http.Query

interface BooksRepository {
    suspend fun getBooks(query: String): Book
}


class DefaultBooksRepository(
    private val booksApiService: BookApiService
) : BooksRepository {
    override suspend fun getBooks(query: String): Book = booksApiService.getBooks(query)
}
