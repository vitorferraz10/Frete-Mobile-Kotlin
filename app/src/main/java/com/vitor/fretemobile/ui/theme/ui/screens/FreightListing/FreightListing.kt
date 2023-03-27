package com.vitor.fretemobile.ui.theme.ui.screens.FreightListing

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.vitor.fretemobile.ui.theme.ui.components.Card.CardComponent
import com.vitor.fretemobile.ui.theme.ui.components.ListingFreights.Header.Header

@Composable
fun FreightListing(navController: NavHostController) {

    Column(modifier = Modifier.fillMaxSize()) {
        Header(navController)
        LazyColumn {
            items(20) {
                CardComponent()
            }
        }

    }

}