package com.vitor.fretemobile.ui.theme.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.vitor.fretemobile.ui.theme.FreteMobileTheme

class FindFreightsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FreteMobileTheme {
                Surface {
                    Column(Modifier
                        .fillMaxSize()
                        .padding(16.dp)) {
                        FindFreights()
                    }
                }
            }
        }
    }
}

@Composable
fun FindFreights() {
    Text(text = "Example screen")
}