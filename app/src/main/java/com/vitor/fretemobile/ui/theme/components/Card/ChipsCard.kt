package com.vitor.fretemobile.ui.theme.components.Card

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vitor.fretemobile.R

@Composable
fun ChipsCard(
    textChips: String,
    colorChip: Int = R.color.white,
    colorTextContent: Int = R.color.black,
) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier


            .height(30.dp)
            .background(colorResource(id = colorChip))
            .border(
                width = 1.dp,
                color = colorResource(id = colorChip),
                shape = RoundedCornerShape(50)
            )


    ) {
        Text(text = textChips,
            modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp),
            fontSize = 12.sp,
            fontWeight = FontWeight(400),
            fontFamily = MaterialTheme.typography.body1.fontFamily,
            color = colorResource(id = colorTextContent))
    }
}

@Preview(showBackground = true)
@Composable
fun ChipsPrev() {
    ChipsCard(textChips = "Patrocinado",
        colorChip = R.color.chips_pink_weak,
        colorTextContent = R.color.chips_pink_weak)
}