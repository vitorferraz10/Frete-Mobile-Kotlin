package com.vitor.fretemobile.ui.theme.components.Button

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ButtonCustom(
    textContent: String,
    colorButton: Color,
    colorContentButton: Color,
    handleClick: () -> Unit,
) {
    Button(
        onClick = { handleClick() },
        Modifier
            .fillMaxWidth()
            .height(48.dp)
            .clip(
                shape = RoundedCornerShape(16.dp),
            ),

        colors = ButtonDefaults.buttonColors(
            backgroundColor = colorButton,
            contentColor = colorContentButton,
        ),

        ) { Text(text = textContent, style = MaterialTheme.typography.h1) }
}