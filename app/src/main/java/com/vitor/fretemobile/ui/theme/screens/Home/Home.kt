package com.vitor.fretemobile.ui.theme.screens.Home

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vitor.fretemobile.R
import com.vitor.fretemobile.ui.theme.FreteMobileTheme
import com.vitor.fretemobile.ui.theme.components.ButtonToModal.ButtonToModal
import com.vitor.fretemobile.ui.theme.components.Header.Header
import com.vitor.fretemobile.ui.theme.components.TitlePageCustom.TitleCustom
import com.vitor.fretemobile.ui.theme.components.TwoButtonsHomeMain.TwoButtonsHomeMain

@Composable
fun Home() {
    Column(Modifier.fillMaxSize()) {
        Header()
        Spacer(modifier = Modifier.height(56.dp))
        TitleCustom(stringResource(id = R.string.title_home))
        Spacer(modifier = Modifier.height(32.dp))
        TwoButtonsHomeMain()

    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    FreteMobileTheme {
        Home()
    }
}