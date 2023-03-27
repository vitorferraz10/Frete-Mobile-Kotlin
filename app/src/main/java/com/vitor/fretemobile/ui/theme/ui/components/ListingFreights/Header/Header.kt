package com.vitor.fretemobile.ui.theme.ui.components.ListingFreights.Header

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.vitor.fretemobile.ui.theme.ui.DS.Chips
import com.vitor.fretemobile.ui.theme.ui.Routes
import com.vitor.fretemobile.ui.theme.ui.components.home.Header.ContainerHeaderListing
import com.vitor.fretemobile.ui.theme.ui.components.utils.ButtonOnlyIcon.ButtonOnlyIcon

@Composable
fun Header(navController: NavHostController) {
    val nav = remember { Routes() }
    ContainerHeaderListing {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            ButtonOnlyIcon(icon = Icons.Outlined.ArrowBack,
                handleClick = { nav.useNavigateBackPage(navController) })

            ButtonOnlyIcon(icon = Icons.Filled.Menu,
                handleClick = { nav.useNavigate(navController, nav.FIND_FREIGHTS) }
            )
        }
        Spacer(modifier = Modifier.height(18.dp))
        LazyRow(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(10.dp), state = rememberLazyListState()) {
            items(6) {
                Chips(textContent = "Raio",
                    iconContent = Icons.Filled.KeyboardArrowDown,
                    handleClick = {})
            }

        }
    }

}

@Preview(showBackground = true)
@Composable
fun HeaderPrev() {
    ContainerHeaderListing {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            ButtonOnlyIcon(icon = Icons.Outlined.ArrowBack)
            ButtonOnlyIcon(icon = Icons.Filled.Menu)
        }
    }
}