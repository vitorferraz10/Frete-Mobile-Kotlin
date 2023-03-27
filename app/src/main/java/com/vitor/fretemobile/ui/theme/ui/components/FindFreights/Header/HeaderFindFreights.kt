package com.vitor.fretemobile.ui.theme.ui.components.FindFreights.Header

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.vitor.fretemobile.ui.theme.ui.components.utils.ButtonOnlyIcon.ButtonOnlyIcon


@Composable
fun HeaderFindFreights(navController: NavHostController) {

    Row(Modifier
        .fillMaxWidth()
        .height(56.dp),
        Arrangement.spacedBy(16.dp),
        Alignment.CenterVertically
    ) {
        ButtonOnlyIcon(handleClick = { navController.popBackStack() },
            icon = Icons.Outlined.ArrowBack)


        Text(text = "Encontrar fretes",
            Modifier.padding(top = 5.dp, bottom = 5.dp),
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = MaterialTheme.typography.body1.fontFamily)

    }
}

@Preview(showBackground = true)
@Composable
fun HeaderPrev() {
    val navController = rememberNavController()
    HeaderFindFreights(navController)
}