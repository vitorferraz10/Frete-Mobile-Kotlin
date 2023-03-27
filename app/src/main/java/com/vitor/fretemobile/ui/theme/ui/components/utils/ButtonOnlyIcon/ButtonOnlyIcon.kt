package com.vitor.fretemobile.ui.theme.ui.components.utils.ButtonOnlyIcon

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vitor.fretemobile.R
import com.vitor.fretemobile.ui.theme.ui.DS.mediumButton


@Composable
fun ButtonOnlyIcon(handleClick: () -> Unit = {}, icon: ImageVector) {

    Modifier.mediumButton()?.let { it ->
        OutlinedButton(
            onClick = { handleClick() },
            modifier = it,
            colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Transparent),
            border = BorderStroke(0.dp, Color.Transparent),
        ) {
            Icon(imageVector = icon,
                contentDescription = "Icons to back",
                tint = colorResource(id = R.color.icon_color_weak),
                modifier = Modifier
                    .widthIn(13.dp))
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BtnPrev() {
    ButtonOnlyIcon(icon = Icons.Outlined.ArrowBack)
}