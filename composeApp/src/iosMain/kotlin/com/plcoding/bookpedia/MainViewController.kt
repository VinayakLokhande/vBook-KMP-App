package com.plcoding.bookpedia

import androidx.compose.runtime.remember
import androidx.compose.ui.window.ComposeUIViewController
import com.plcoding.bookpedia.app.App
import io.ktor.client.engine.darwin.Darwin

fun MainViewController() = ComposeUIViewController(
    configure = {

    }
) { App(
    engine = remember { Darwin.create() }
) }