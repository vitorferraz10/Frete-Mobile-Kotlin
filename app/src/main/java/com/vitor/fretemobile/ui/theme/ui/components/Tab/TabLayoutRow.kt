package com.vitor.fretemobile.ui.theme.ui.components.Tab

import androidx.compose.material.Tab
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vitor.fretemobile.R


@Composable
fun TabLayoutRow() {
    var tabIndex by remember { mutableStateOf(0) }

    val tabData = listOf(
        "Origem e destino",
        "Raio (Distância)",
        "Veículo e carroceria",
        "Preço",
        "Outros",
    )

    ScrollableTabRow(
        selectedTabIndex = tabIndex,
        backgroundColor = Color.Transparent,
        contentColor = colorResource(id = R.color.red_freight_main),
        divider = {
            TabRowDefaults.Divider(
                thickness = 3.dp,
                color = colorResource(id = R.color.neutral_border_weak)
            )
        },

        ) {


        tabData.forEachIndexed { index, text ->

            Tab(selected = tabIndex == index, onClick = {
                tabIndex = index
            }, text = {
                Text(text = text)
            })
        }
    }

}


@Preview(showBackground = true)
@Composable
fun TabsPrev() {
    TabLayoutRow()
}
