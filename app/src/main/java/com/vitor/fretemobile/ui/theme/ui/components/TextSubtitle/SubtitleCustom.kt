package com.vitor.fretemobile.ui.theme.ui.components.TextSubtitle

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.vitor.fretemobile.R

@Composable
fun SubtitleCustom() {
    Text(text = "Escolha quantos filtros quiser para sua busca",
        Modifier,
        color = colorResource(id = R.color.text_weak),
        fontSize = 14.sp,
        fontWeight = FontWeight(500),
        fontFamily = MaterialTheme.typography.body1.fontFamily
    )
}

@Preview(showBackground = true)
@Composable
fun SubtitleCustomPrev() {
    SubtitleCustom()
}