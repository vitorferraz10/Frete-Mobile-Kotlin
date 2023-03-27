package com.vitor.fretemobile.ui.theme.ui.components.Card

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vitor.fretemobile.R
import com.vitor.fretemobile.ui.theme.ShapeCard
import com.vitor.fretemobile.ui.theme.data.ExampleDataToCard

@Composable
fun CardComponent() {

    val family = MaterialTheme.typography.body1.fontFamily

    val sampleData = ExampleDataToCard()

    BoxCard() {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 14.dp, horizontal = 21.dp),
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End) {
                ChipsCard(textChips = "Patrocinado",
                    colorChip = R.color.chips_pink_weak,
                    colorTextContent = R.color.color_font_chips)
            }
            Spacer(modifier = Modifier.height(16.dp))

            Row(modifier = Modifier
                .fillMaxWidth()
                .height(52.dp),
                horizontalArrangement = Arrangement.spacedBy(21.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.trip_icon),
                    contentDescription = "icon to trip",
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(9.dp)
                )

                Column(modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.SpaceBetween) {
                    Text(text = "Guarulhos, SP", fontFamily = family, fontWeight = FontWeight(500))
                    Text(text = "Belo Horizonte, MG",
                        fontFamily = family,
                        fontWeight = FontWeight(500))
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
                sampleData.chipsCategoryList.forEach { label ->
                    ChipsCard(textChips = label,
                        colorChip = R.color.background_weak,
                        colorTextContent = R.color.text_subtitle_medium)
                }

            }

            Spacer(modifier = Modifier.height(21.dp))

            Row(modifier = Modifier
                .fillMaxWidth()
            ) {

                Column(modifier = Modifier) {
                    Text(text = "R$ 2.500",
                        fontFamily = family,
                        fontSize = 27.sp,
                        fontWeight = FontWeight(700))
                    Text(text = "Com pedágio ",
                        fontFamily = family,
                        fontSize = 16.sp,
                        fontWeight = FontWeight(400))
                }
            }
        }

        Spacer(modifier = Modifier.height(21.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(color = colorResource(id = R.color.background_weak), shape = ShapeCard)
                .padding(horizontal = 16.dp, vertical = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(21.dp)

        ) {
            Image(painter = painterResource(id = R.drawable.logo),
                contentDescription = "",
                modifier = Modifier
                    .width(64.dp)
                    .height(40.dp))
            Column() {
                Text(
                    text = "Fretebras",
                    fontFamily = family,
                    color = colorResource(id = R.color.text_subtitle_medium),
                    fontSize = 16.sp,
                    fontWeight = FontWeight(700))

                Text(
                    text = "Livre de carga e descarga, livre de carga e descarga",
                    fontFamily = family,
                    fontSize = 16.sp,
                    color = colorResource(id = R.color.text_subtitle_medium),
                    fontWeight = FontWeight(400),
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun CardPrev() {
    CardComponent()
}