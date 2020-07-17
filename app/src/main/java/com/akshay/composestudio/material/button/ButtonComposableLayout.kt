package com.akshay.composestudio.material.button

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Border
import androidx.ui.graphics.Color
import androidx.ui.graphics.Shape
import androidx.ui.layout.InnerPadding
import androidx.ui.unit.Dp

interface ButtonComposableLayout {
    @Composable
    fun ButtonBuild(
            mModifier: Modifier? = null,
            mBackgroundColor: Color? = null,
            mEnabled: Boolean? = true,
            mElevation: Dp? = null,
            mShape: Shape? = null,
            mBorder: Border? = null,
            mContentColor: Color? = null,
            mInnerPadding: InnerPadding? = null,
            mText: String? = "Compose Buttons"
    )

    @Composable
    fun OutlinedButtonBuild(
            mModifier: Modifier? = null,
            mBackgroundColor: Color? = null,
            mEnabled: Boolean? = true,
            mElevation: Dp? = null,
            mShape: Shape? = null,
            mBorder: Border? = null,
            mContentColor: Color? = null,
            mInnerPadding: InnerPadding? = null,
            mText: String? = "Compose Buttons"
    )

    @Composable
    fun TextButtonBuild(
            mModifier: Modifier? = null,
            mBackgroundColor: Color? = null,
            mEnabled: Boolean? = true,
            mElevation: Dp? = null,
            mShape: Shape? = null,
            mBorder: Border? = null,
            mContentColor: Color? = null,
            mInnerPadding: InnerPadding? = null,
            mText: String? = "Compose Buttons"
    )
}