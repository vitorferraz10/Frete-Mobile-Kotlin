package com.vitor.fretemobile.ui.theme.ui.components.TwoButtonsHomeMain

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.vitor.fretemobile.ui.theme.ui.components.ButtonToModal.ButtonToModal

@Composable
fun TwoButtonsHomeMain(onNavigateToFindFreights: () -> Unit = {}) {

    Column(Modifier) {

        ButtonToModal("Origem",
            "Escolha de onde você vai sair",
            handleClick = { onNavigateToFindFreights() },
            borderTopStart = 10.dp,
            borderTopEnd = 10.dp)


        ButtonToModal("Destino",
            "Escolha pra onde você vai",
            handleClick = { onNavigateToFindFreights() },
            borderBottomStart = 10.dp,
            borderBottomEnd = 10.dp)

    }
    

}

@Preview
@Composable
fun ButtonsPreview() {
        TwoButtonsHomeMain()
}