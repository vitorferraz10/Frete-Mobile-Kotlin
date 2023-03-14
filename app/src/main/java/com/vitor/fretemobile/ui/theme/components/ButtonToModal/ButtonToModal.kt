package com.vitor.fretemobile.ui.theme.components.ButtonToModal

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vitor.fretemobile.R

@Composable
fun ButtonToModal(
    label: String = "",
    textContent: String = "",
    handleClick: () -> Unit,
    borderTopStart: Dp = 0.dp,
    borderTopEnd: Dp = 0.dp,
    borderBottomStart: Dp = 0.dp,
    borderBottomEnd: Dp = 0.dp,
) {
    Button(onClick = { handleClick() },
        Modifier
            .fillMaxWidth()
            .heightIn(89.dp)
            .padding(start = 24.dp, top = 16.dp, end = 16.dp, bottom = 24.dp)
            .border(width = 1.dp,
                color = colorResource(id = R.color.neutral_border_weak),
                shape = RoundedCornerShape(topStart = borderTopStart,
                    topEnd = borderTopEnd,
                    bottomStart = borderBottomStart,
                    bottomEnd = borderBottomEnd)),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.White,

        )

    ) {
        Column {
            Text(text = label.uppercase(),
                color = Color.Black,
                fontSize = 10.sp,
                fontFamily = MaterialTheme.typography.body1.fontFamily)
            Text(text = textContent,
                color = colorResource(id = R.color.text_weak),
                fontSize = 13.sp,
                fontFamily = MaterialTheme.typography.body1.fontFamily)
        }

        Icon(imageVector = Icons.Default.KeyboardArrowRight,
            contentDescription = null,
            tint = colorResource(id = R.color.neutral_border_weak))
    }
}

