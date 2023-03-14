package com.vitor.fretemobile.ui.theme.components.TwoButtonsHomeMain

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.vitor.fretemobile.ui.theme.components.ButtonToModal.ButtonToModal

@Composable
fun TwoButtonsHomeMain(navController: NavHostController) {

    Column(
        Modifier
            .fillMaxWidth()
            .height(437.333.dp),
    )

    {
        ButtonToModal("Origem",
            "Escolha de onde você vai sair",
            handleClick = { navController.navigate("findFreights")},
            borderTopStart = 10.dp,
            borderTopEnd = 10.dp)

        ButtonToModal("Destino",
            "Escolha pra onde você vai",
            handleClick = { navController.navigate("findFreights")},
            borderBottomStart = 10.dp,
            borderBottomEnd = 10.dp)
    }

}

@Preview
@Composable
fun ButtonsPreview() {
    val navController = rememberNavController()
    TwoButtonsHomeMain(navController)
}