package com.vitor.fretemobile.ui.theme.ui.components.home.Header

import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun ContainerHeaderListing(content: @Composable () -> Unit = {}) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .heightIn(130.dp)
        .padding(horizontal = 16.dp, vertical = 16.dp)) {
        content()
    }
}