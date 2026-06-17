package com.plcoding.bookpedia.book.data.repository

import com.plcoding.bookpedia.book.data.mapper.toBook
import com.plcoding.bookpedia.book.data.network.RemoteBookDataSource
import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.book.domain.repository.BootRepository
import com.plcoding.bookpedia.core.domain.DataError
import com.plcoding.bookpedia.core.domain.Result
import com.plcoding.bookpedia.core.domain.map

class BookRepositoryImpl(
    private val remoteBookDataSource: RemoteBookDataSource
) : BootRepository {
    override suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote> {
        return remoteBookDataSource
            .searchBooks(query)
            .map { bookDto ->
                bookDto.results.map { it.toBook() }
            }
    }
}