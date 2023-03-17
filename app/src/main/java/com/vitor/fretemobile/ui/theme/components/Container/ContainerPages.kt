package com.vitor.fretemobile.ui.theme.components.Container

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun ContainerPages(
    contentContainer: @Composable() (ColumnScope.() -> Unit),
    ) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(start = 16.dp, end = 16.dp, bottom = 8.dp, top = 8.dp),

        ) {
        contentContainer()
    }
}