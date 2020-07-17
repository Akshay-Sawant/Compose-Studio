package com.akshay.composestudio.material.extendedfloatingactionbutton

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.graphics.Color
import androidx.ui.graphics.Shape
import androidx.ui.graphics.vector.VectorAsset
import androidx.ui.unit.Dp

interface ExtendedFloatingActionButtonComposableLayout {

    @Composable
    fun ExtendedFloatingActionButtonBuild(
            mText: String? = "Default",
            mModifier: Modifier? = null,
            mIcon: VectorAsset? = null,
            mIconModifier: Modifier? = null,
            mIconTint: Color? = null,
            mShape: Shape? = null,
            mBackgroundColor: Color? = null,
            mContentColor: Color? = null,
            mElevation: Dp? = null
    )
}