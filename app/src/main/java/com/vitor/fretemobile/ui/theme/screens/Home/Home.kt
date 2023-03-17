package com.vitor.fretemobile.ui.theme.screens.Home

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
import com.vitor.fretemobile.ui.theme.Routes
import com.vitor.fretemobile.ui.theme.components.Button.ButtonCustom
import com.vitor.fretemobile.ui.theme.components.TitlePageCustom.TitleCustom
import com.vitor.fretemobile.ui.theme.components.TwoButtonsHomeMain.TwoButtonsHomeMain
import com.vitor.fretemobile.ui.theme.components.home.Header.Header

class NavigationToFindFreight() {
    private val routes = Routes()

    fun onNavigateToFindFreights(navController: NavHostController) {
        navController.navigate(routes.FIND_FREIGHTS)
    }

}

@Composable
fun Home(navController: NavHostController) {
    val nav = remember { NavigationToFindFreight() }
    Surface {
        Column(Modifier
            .fillMaxSize()
            .padding(16.dp)) {
            Column(Modifier.fillMaxSize()) {
                Header()
                Spacer(modifier = Modifier.height(56.dp))
                TitleCustom(stringResource(id = R.string.title_home))
                Spacer(modifier = Modifier.height(100.dp))
                Column {
                    TwoButtonsHomeMain { nav.onNavigateToFindFreights(navController) }
                }

                Column(Modifier
                    .fillMaxHeight(),
                    verticalArrangement = Arrangement.Bottom
                ) {

                    ButtonCustom(textContent = "Ver todos os fretes (32.172)",
                        colorButton = colorResource(id = R.color.red_freight_main),
                        colorContentButton = Color.White,
                        handleClick = { navController.navigate("findFreights") })
                    ButtonCustom(textContent = "Quero anunciar fretes",
                        colorButton = Color.White,
                        colorContentButton = colorResource(id = R.color.red_freight_main),
                        handleClick = { navController.navigate("findFreights") })
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