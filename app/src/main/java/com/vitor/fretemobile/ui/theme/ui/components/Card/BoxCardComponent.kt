package com.vitor.fretemobile.ui.theme.ui.components.Card


import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.vitor.fretemobile.R

@Composable
fun BoxCard(content: @Composable () -> Unit = {}) {
    val roundedBox = RoundedCornerShape(
        topStart = 14.dp,
        topEnd = 14.dp,
        bottomStart = 14.dp,
        bottomEnd = 14.dp)
    Column(modifier = Modifier
        .fillMaxWidth()
        .height(408.dp)
        .padding(horizontal = 27.dp, vertical = 27.dp)
        .border(width = 1.dp,
            color = colorResource(id = R.color.neutral_border_weak),
            shape = roundedBox
        )) {
        content()
    }
}

