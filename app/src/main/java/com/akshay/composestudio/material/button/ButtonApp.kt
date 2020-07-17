package com.akshay.composestudio.material.button

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Border
import androidx.ui.foundation.shape.corner.CutCornerShape
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.InnerPadding
import androidx.ui.layout.padding
import androidx.ui.material.*
import androidx.ui.unit.dp

class ButtonApp {

    @Composable
    fun Build() {
        SimpleButtonComponent()
        BorderedButtonComponent()
        RoundCorneredButtonComponent()
        CutCorneredButtonComponent()
        DisabledButtonComponent()
        OutlinedButtonComponent()
        TextButtonComponent()
    }

    @Composable
    fun SimpleButtonComponent() {
        ButtonComponent.ButtonBuild(
                mModifier = Modifier.padding(
                        start = 8.dp,
                        top = 8.dp,
                        end = 8.dp
                ),
                mBackgroundColor = MaterialTheme.colors.primary,
                mContentColor = Color.White,
                mInnerPadding = InnerPadding(8.dp),
                mText = "Simple Button"
        )
    }

    @Composable
    fun BorderedButtonComponent() {
        ButtonComponent.ButtonBuild(
                mModifier = Modifier.padding(
                        start = 8.dp,
                        top = 8.dp,
                        end = 8.dp
                ),
                mBackgroundColor = Color.White,
                mBorder = Border(
                        size = 1.dp,
                        color = Color.Gray
                ),
                mContentColor = Color.Black,
                mInnerPadding = InnerPadding(8.dp),
                mText = "Bordered Button"
        )
    }

    @Composable
    fun RoundCorneredButtonComponent() {
        ButtonComponent.ButtonBuild(
                mModifier = Modifier.padding(
                        start = 8.dp,
                        top = 8.dp,
                        end = 8.dp
                ),
                mBackgroundColor = Color.Transparent,
                mShape = RoundedCornerShape(8.dp),
                mBorder = Border(
                        size = 1.dp,
                        color = Color.Red
                ),
                mContentColor = Color.Red,
                mInnerPadding = InnerPadding(8.dp),
                mText = "Round Cornered Button"
        )
    }

    @Composable
    fun CutCorneredButtonComponent() {
        ButtonComponent.ButtonBuild(
                mModifier = Modifier.padding(
                        start = 8.dp,
                        top = 8.dp,
                        end = 8.dp
                ),
                mBackgroundColor = Color.Transparent,
                mShape = CutCornerShape(8.dp),
                mBorder = Border(
                        size = 1.dp,
                        color = MaterialTheme.colors.primaryVariant
                ),
                mContentColor =
                MaterialTheme.colors.primarySurface,
                mInnerPadding = InnerPadding(8.dp),
                mText = "Cut Cornered Button"
        )
    }

    @Composable
    fun DisabledButtonComponent() {
        ButtonComponent.ButtonBuild(
                mModifier = Modifier.padding(8.dp),
                mBackgroundColor = Color.Cyan,
                mEnabled = false,
                mElevation = 4.dp,
                mContentColor = Color.White,
                mInnerPadding = InnerPadding(8.dp),
                mText = "Disabled Button"
        )
    }

    @Composable
    fun OutlinedButtonComponent() {
        ButtonComponent.OutlinedButtonBuild(
                mModifier = Modifier.padding(8.dp),
                mBackgroundColor = Color.Transparent,
                mEnabled = true,
                mBorder = Border(
                        size = 2.dp,
                        color = Color.Blue
                ),
                mContentColor = Color.Black,
                mInnerPadding = InnerPadding(8.dp),
                mText = "Outlined Button"
        )
    }

    @Composable
    fun TextButtonComponent() {
        ButtonComponent.TextButtonBuild(
                mModifier = Modifier.padding(8.dp),
                mBackgroundColor = Color.Magenta,
                mContentColor = Color.White,
                mElevation = 4.dp,
                mInnerPadding = InnerPadding(8.dp),
                mText = "Text Button"
        )
    }
}