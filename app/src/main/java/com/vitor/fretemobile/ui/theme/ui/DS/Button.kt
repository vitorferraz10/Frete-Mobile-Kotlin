package com.vitor.fretemobile.ui.theme.ui.DS

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class SizeButtonProperties(var size: String) {

    private val small = mapOf(
        "size" to Modifier.width(33.dp).height(33.dp),
    )
    private val medium = mapOf(
        "size" to Modifier.width(53.dp).height(53.dp),
    )
    private val large = mapOf(
        "size" to Modifier.width(73.dp).height(73.dp),
    )


    fun sizeButton(): Map<String, Modifier> {

        if (this.size === "small") return small
        if (this.size === "medium") return medium
        if (this.size === "large") return large

        return medium
    }

}

@SuppressLint("ModifierFactoryUnreferencedReceiver")
fun Modifier.smallButton(): Modifier? {
    val button = SizeButtonProperties("small")
    return button.sizeButton()["size"]
}

@SuppressLint("ModifierFactoryUnreferencedReceiver")
fun Modifier.mediumButton(): Modifier? {
    val button = SizeButtonProperties("medium")

    return button.sizeButton()["size"]
}
@SuppressLint("ModifierFactoryUnreferencedReceiver")
fun Modifier.largeButton(): Modifier? {
    val button = SizeButtonProperties("large")

    return button.sizeButton()["size"]
}