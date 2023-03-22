package com.vitor.fretemobile.ui.theme.components.Card

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vitor.fretemobile.R

@Composable
fun CardComponent() {
    val chipsCategoryList: List<String> =
        listOf("Material p/ contrução", "Bau", "Fiorino + 5", "+3")
    BoxCard() {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 14.dp, horizontal = 8.dp),
            horizontalArrangement = Arrangement.End
        ) {
            ChipsCard(
                textChips = "Patrocinado",
                colorChip = R.color.chips_pink_weak,
                colorTextContent = R.color.color_font_chips)
        }
        Spacer(modifier = Modifier.height(100.dp))

        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            chipsCategoryList.forEach { label ->
                ChipsCard(
                    textChips = label,
                    colorChip = R.color.background_weak,
                    colorTextContent = R.color.text_subtitle_medium)
            }

        }

    }
}

@Preview(showBackground = true)
@Composable
fun CardPrev() {
    CardComponent()
}