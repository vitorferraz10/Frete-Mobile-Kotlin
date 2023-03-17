package com.vitor.fretemobile.ui.theme.components.FindFreights.Header

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.vitor.fretemobile.R

@Composable
fun HeaderFindFreights(navController: NavHostController) {

    Row(Modifier
        .fillMaxWidth()
        .height(56.dp),
        Arrangement.spacedBy(16.dp),
        Alignment.CenterVertically


    ) {
        OutlinedButton(
            onClick = { navController.popBackStack() },
            colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Transparent),
            border = BorderStroke(0.dp, Color.Transparent),
        ) {
            Icon(imageVector = Icons.Outlined.ArrowBack,
                contentDescription = "Icons to back",
                modifier = Modifier
                    .padding(top = 5.dp, bottom = 5.dp),
                tint = colorResource(id = R.color.icon_color_weak))
        }

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