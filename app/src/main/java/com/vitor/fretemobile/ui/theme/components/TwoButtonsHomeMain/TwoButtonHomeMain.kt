package com.vitor.fretemobile.ui.theme.components.TwoButtonsHomeMain

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vitor.fretemobile.ui.theme.components.ButtonToModal.ButtonToModal

@Composable
fun TwoButtonsHomeMain() {
    Column(Modifier
        .fillMaxWidth()
        .height(437.333.dp),
        )

    {
        ButtonToModal(
            "Origem",
            "Escolha de onde você vai sair",
            handleClick = { Log.i("Teste", "Teste") },
            borderTopStart = 10.dp,
            borderTopEnd = 10.dp
        )

        ButtonToModal(
            "Destino",
            "Escolha pra onde você vai",
            handleClick = { Log.i("Teste", "Teste") },
            borderBottomStart = 10.dp,
            borderBottomEnd = 10.dp
        )
    }

}

@Preview
@Composable
fun ButtonsPreview() {
    TwoButtonsHomeMain()
}