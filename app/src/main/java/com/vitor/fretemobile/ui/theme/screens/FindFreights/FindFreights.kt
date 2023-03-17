package com.vitor.fretemobile.ui.theme.screens.FindFreights

import androidx.compose.foundation.layout.*
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.material.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.vitor.fretemobile.ui.theme.components.Button.ButtonCustom
import com.vitor.fretemobile.ui.theme.components.Container.ContainerPages
import com.vitor.fretemobile.ui.theme.components.FindFreights.Header.HeaderFindFreights
import com.vitor.fretemobile.ui.theme.components.Modal.ModalFindFreights
import com.vitor.fretemobile.ui.theme.components.TextSubtitle.SubtitleCustom
import com.vitor.fretemobile.ui.theme.components.TwoButtonsHomeMain.TwoButtonsHomeMain
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun FindFreights(navController: NavHostController) {
    val state = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden)
    val scope = rememberCoroutineScope()

    ModalFindFreights(state = state) {
        Column() {
            HeaderFindFreights(navController)
            ContainerPages {
                SubtitleCustom()
                Spacer(modifier = Modifier.height(108.dp))
                TwoButtonsHomeMain { scope.launch() { state.show() } }
                Column(Modifier
                    .fillMaxHeight()
                    .padding(bottom = 16.dp),
                    verticalArrangement = Arrangement.Bottom) {
                    ButtonCustom(
                        textContent = "Ver Fretes disponíves",
                        colorButton = colorResource(id = com.vitor.fretemobile.R.color.red_freight_main),
                        colorContentButton = Color.White,
                        handleClick = {}
                    )
                }

            }
        }
    }

}


@Preview(showBackground = true)
@Composable
fun FindFreightsPrev() {
    val navController = rememberNavController()
    FindFreights(navController)
}