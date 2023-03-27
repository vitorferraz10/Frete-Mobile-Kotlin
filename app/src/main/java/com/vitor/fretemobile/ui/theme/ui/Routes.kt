package com.vitor.fretemobile.ui.theme.ui

import androidx.navigation.NavHostController

class Routes() {
    var HOME = "home"
        private set
    var FIND_FREIGHTS = "findFreights"
        private set
    var FREIGTH_LISTING = "freightListing"
        private set


    fun useNavigate(navController: NavHostController, routerDestination: String) {
        navController.navigate(routerDestination)
    }

    fun useNavigateBackPage(navController: NavHostController) {
        navController.popBackStack()
    }


}








