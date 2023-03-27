package com.vitor.fretemobile.ui.theme.ui.screens.Home

import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.vitor.fretemobile.R
import com.vitor.fretemobile.ui.theme.FreteMobileTheme
import com.vitor.fretemobile.ui.theme.ui.Routes
import com.vitor.fretemobile.ui.theme.ui.components.Button.ButtonCustom
import com.vitor.fretemobile.ui.theme.ui.components.TitlePageCustom.TitleCustom
import com.vitor.fretemobile.ui.theme.ui.components.TwoButtonsHomeMain.TwoButtonsHomeMain
import com.vitor.fretemobile.ui.theme.ui.components.home.Header.HeaderMain

@Composable
fun Home(navController: NavHostController) {
    val nav = remember { Routes() }

    Surface {
        Column(Modifier
            .fillMaxSize()
            .padding(16.dp)) {
            Column(Modifier.fillMaxSize()) {
                HeaderMain()
                Spacer(modifier = Modifier.height(56.dp))
                TitleCustom(stringResource(id = R.string.title_home))
                Spacer(modifier = Modifier.height(100.dp))
                Column {
                    TwoButtonsHomeMain { nav.useNavigate(navController, nav.FIND_FREIGHTS) }
                }

                Column(Modifier
                    .fillMaxHeight(),
                    verticalArrangement = Arrangement.Bottom
                ) {

                    ButtonCustom(textContent = "Ver todos os fretes (32.172)",
                        colorButton = colorResource(id = R.color.red_freight_main),
                        colorContentButton = Color.White,
                        handleClick = { nav.useNavigate(navController, nav.FREIGTH_LISTING) })
                    ButtonCustom(textContent = "Quero anunciar fretes",
                        colorButton = Color.White,
                        colorContentButton = colorResource(id = R.color.red_freight_main),
                        handleClick = { nav.useNavigate(navController, nav.FIND_FREIGHTS) })
                }
            }

        }
    }

}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    val navController = rememberNavController()
    FreteMobileTheme {
        Home(navController)
    }
}