package com.vitor.fretemobile.ui.theme.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.vitor.fretemobile.ui.theme.FreteMobileTheme
import com.vitor.fretemobile.ui.theme.ui.Routes
import com.vitor.fretemobile.ui.theme.ui.screens.FindFreights.FindFreights
import com.vitor.fretemobile.ui.theme.ui.screens.FreightListing.FreightListing
import com.vitor.fretemobile.ui.theme.ui.screens.Home.Home

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val routes = Routes()
        super.onCreate(savedInstanceState)
        setContent {
            FreteMobileTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = routes.HOME) {
                    composable(routes.HOME) { Home(navController) }
                    composable(routes.FIND_FREIGHTS) { FindFreights(navController) }
                    composable(routes.FREIGTH_LISTING) { FreightListing(navController) }
                }
            }
        }
    }
}

