package com.vitor.fretemobile.ui.theme.ui.DS

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.vitor.fretemobile.ui.theme.ColorGrayWeak
import com.vitor.fretemobile.ui.theme.ShapeChips

@Composable
fun Chips(textContent: String? = null, iconContent: ImageVector, handleClick: () -> Unit) {
    Button(onClick = { handleClick() },
        modifier = Modifier
            .border(width = 1.dp, color = ColorGrayWeak, shape = ShapeChips)
            .background(color = Color.White, shape = ShapeChips),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.White,
            contentColor = Color.Black,
        ),
        shape = ShapeChips) {
        textContent?.let { Text(text = it) }
        Icon(imageVector = iconContent, contentDescription = "Icons chips")
    }
}

