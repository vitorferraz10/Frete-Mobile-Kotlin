package com.vitor.fretemobile.ui.theme.ui.components.Modal

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterialApi::class)

@Composable
fun ModalFindFreights(state: ModalBottomSheetState, contentModal: @Composable () -> Unit = {}) {


    ModalBottomSheetLayout(
        sheetState = state,
        modifier = Modifier.fillMaxSize(), sheetShape = RoundedCornerShape(24.dp),
        sheetContent = {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(10.dp),
                contentPadding = PaddingValues(vertical = 16.dp)) {
                items(50) {
                    ListItem(
                        text = { Text(text = "Item $it") }
                    )
                }
            }

        },

        ) {
        contentModal()
    }
}
