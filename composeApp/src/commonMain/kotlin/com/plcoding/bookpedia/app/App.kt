package com.plcoding.bookpedia.app

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.plcoding.bookpedia.book.data.network.KtorRemoteBookDataSource
import com.plcoding.bookpedia.book.data.repository.BookRepositoryImpl
import com.plcoding.bookpedia.book.domain.repository.BootRepository
import com.plcoding.bookpedia.book.presentation.book_list.BookListScreenRoot
import com.plcoding.bookpedia.book.presentation.book_list.BookListViewmodel
import com.plcoding.bookpedia.core.data.HttpClientFactory
import io.ktor.client.HttpClient
import io.ktor.client.engine.HttpClientEngine
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
fun App(engine: HttpClientEngine) {
    MaterialTheme {
        BookListScreenRoot(
            viewmodel = remember {
                BookListViewmodel(
                    bookRepository = BookRepositoryImpl(
                        remoteBookDataSource = KtorRemoteBookDataSource(
                            httpClient = HttpClientFactory.create(engine)
                        )
                    )
                )
            },
            onBookClick = {

            }
        )
    }
}