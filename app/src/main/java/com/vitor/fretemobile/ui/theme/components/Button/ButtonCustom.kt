package com.vitor.fretemobile.ui.theme.components.Button

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun ButtonCustom(
    label: String,
    textContentButton: String,
    iconUrl: ImageVector,
    handleClick: () -> Unit,
) {
    Button(onClick = { handleClick() }) {
        Row {
            Column {
                Text(text = label)
                Text(text = textContentButton)
            }
            Icon(imageVector = iconUrl, contentDescription = "Icon Button")
        }
    }
}