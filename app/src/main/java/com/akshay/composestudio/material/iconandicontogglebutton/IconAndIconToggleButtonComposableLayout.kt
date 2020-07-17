package com.akshay.composestudio.material.iconandicontogglebutton

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.graphics.Color
import androidx.ui.graphics.vector.VectorAsset

interface IconAndIconToggleButtonComposableLayout {

    @Composable
    fun IconButtonBuild(
            mModifier: Modifier? = null,
            mIconModifier: Modifier? = null,
            mIconAsset: VectorAsset? = null,
            mIconTint: Color? = null
    )

    @Composable
    fun IconToggleButtonBuild(
            mChecked: Boolean? = null,
            mEnabled: Boolean? = null,
            mModifier: Modifier? = null,
            mIconModifier: Modifier? = null,
            mIconAsset: VectorAsset? = null,
            mIconTint: Color? = null
    )
}