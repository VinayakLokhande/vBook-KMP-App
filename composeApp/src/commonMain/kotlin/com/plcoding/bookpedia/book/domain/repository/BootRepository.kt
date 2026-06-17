package com.plcoding.bookpedia.book.domain.repository

import com.plcoding.bookpedia.book.data.dto.SearchResponseDto
import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.core.domain.DataError
import com.plcoding.bookpedia.core.domain.Result

interface BootRepository {

    suspend fun searchBooks(query: String) : Result<List<Book>, DataError.Remote>

}