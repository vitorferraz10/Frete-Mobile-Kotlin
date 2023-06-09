package com.vitor.fretemobile.ui.theme.ui.components.home.Header


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vitor.fretemobile.R

@Composable
fun HeaderMain() {
    Row(modifier = Modifier.fillMaxWidth()) {
        Image(painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            Modifier.size(width = 80.dp, height = 16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun HeaderPrev() {
    HeaderMain()
}
