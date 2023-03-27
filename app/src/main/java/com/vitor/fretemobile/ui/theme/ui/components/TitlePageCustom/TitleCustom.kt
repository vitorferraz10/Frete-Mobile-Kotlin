package com.vitor.fretemobile.ui.theme.ui.components.TitlePageCustom

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun TitleCustom(
    textContent: String,
    fontSize: TextUnit = 32.sp,
    TextColor: Color = Color.Black,
    textWeight: FontWeight = FontWeight(700),
) {
    Text(text = textContent,
        fontSize = fontSize,
        color = TextColor,
        style = MaterialTheme.typography.h1)
}