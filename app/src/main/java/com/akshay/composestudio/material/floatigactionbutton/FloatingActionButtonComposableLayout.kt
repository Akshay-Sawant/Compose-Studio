package com.akshay.composestudio.material.floatigactionbutton

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.graphics.Color
import androidx.ui.graphics.Shape
import androidx.ui.graphics.vector.VectorAsset
import androidx.ui.unit.Dp

interface FloatingActionButtonComposableLayout {

    @Composable
    fun FloatingActionButtonBuild(
            mModifier: Modifier? = null,
            mShape: Shape? = null,
            mBackgroundColor: Color? = null,
            mContentColor: Color? = null,
            mElevation: Dp? = null,
            mIcon: VectorAsset? = null,
            mIconModifier: Modifier? = null,
            mIconTint: Color? = null
    )
}