package com.akshay.composestudio.material.iconandicontogglebutton

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.Add
import androidx.ui.material.icons.filled.Call
import androidx.ui.unit.dp

class IconAndIconToggleButtonApp {

    @Composable
    fun Build() {
        IconButtonComponent()
        IconToggleButtonComponent()
    }

    @Composable
    fun IconButtonComponent() {
        IconAndIconToggleButtonComponent.IconButtonBuild(
                mModifier = Modifier.padding(16.dp),
                mIconModifier = Modifier.padding(16.dp),
                mIconAsset = Icons.Default.Add,
                mIconTint = Color.Green
        )
    }

    @Composable
    fun IconToggleButtonComponent() {
        IconAndIconToggleButtonComponent.IconToggleButtonBuild(
                mChecked = false,
                mEnabled = true,
                mModifier = Modifier.padding(16.dp),
                mIconModifier = Modifier.padding(16.dp),
                mIconAsset = Icons.Default.Call,
                mIconTint = Color.Blue
        )
    }
}