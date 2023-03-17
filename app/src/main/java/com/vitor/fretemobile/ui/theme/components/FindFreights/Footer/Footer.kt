package com.vitor.fretemobile.ui.theme.components.FindFreights.Footer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.vitor.fretemobile.R
import com.vitor.fretemobile.ui.theme.components.Button.ButtonCustom

@Composable
fun FooterFindFreights(navController: NavHostController) {
    Column(Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .heightIn(96.dp),
        verticalArrangement = Arrangement.Bottom) {
        Spacer(modifier = Modifier.height(2.dp).background(color = Color.Black))
        Row(Modifier
            .fillMaxWidth()
            .height(96.dp)
            .padding(start = 16.dp, top = 24.dp, end = 16.dp, bottom = 24.dp)
        ) {
            ButtonCustom(textContent = "Ver fretes disponíveis",
                colorButton = colorResource(id = R.color.red_freight_main),
                colorContentButton = Color.White,
                handleClick = { navController.navigate("findFreights") })
        }
    }
}

@Preview
@Composable
fun FooterPrev() {
    val navController = rememberNavController()
    FooterFindFreights(navController)
}