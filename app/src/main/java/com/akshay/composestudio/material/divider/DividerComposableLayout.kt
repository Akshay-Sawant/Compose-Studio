package com.akshay.composestudio.material.divider

import androidx.ui.graphics.Color
import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.unit.Dp

interface DividerComposableLayout {

    @Composable
    fun DividerBuild(
        mModifier: Modifier? = null,
        mColor: Color? = null,
        mThickness: Dp? = null,
        mStartIndent: Dp? = null
    )
}