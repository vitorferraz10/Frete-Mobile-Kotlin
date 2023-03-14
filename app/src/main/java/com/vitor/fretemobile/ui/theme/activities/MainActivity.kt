package com.vitor.fretemobile.ui.theme.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.vitor.fretemobile.ui.theme.FreteMobileTheme
import com.vitor.fretemobile.ui.theme.Routes
import com.vitor.fretemobile.ui.theme.screens.Home.Home

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val routes = Routes()
        super.onCreate(savedInstanceState)
        setContent {
            FreteMobileTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "home") {
                    composable(routes.HOME) { Home(navController) }
                    composable(routes.FIND_FREIGHTS) { FindFreights() }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

