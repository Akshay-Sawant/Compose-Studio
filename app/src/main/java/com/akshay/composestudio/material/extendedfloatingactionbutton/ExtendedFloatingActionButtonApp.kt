package com.akshay.composestudio.material.extendedfloatingactionbutton

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.shape.RectangleShape
import androidx.ui.graphics.Color
import androidx.ui.layout.padding
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.Refresh
import androidx.ui.material.icons.filled.Share
import androidx.ui.material.icons.filled.ShoppingCart
import androidx.ui.unit.dp

class ExtendedFloatingActionButtonApp {

    @Composable
    fun Build() {
        DefaultExtendedFloatingActionButtonComponent()
        TextExtendedFloatingActionButtonComponent()
        ColoredExtendedFloatingActionButtonComponent()
        IconExtendedFloatingActionButtonComponent()
        ShapeExtendedFloatingActionButtonComponent()
        ElevatedExtendedFloatingActionButtonComponent()
    }

    @Composable
    fun DefaultExtendedFloatingActionButtonComponent() {
        ExtendedFloatingActionButtonComponent().ExtendedFloatingActionButtonBuild()
    }

    @Composable
    fun TextExtendedFloatingActionButtonComponent() {
        ExtendedFloatingActionButtonComponent().ExtendedFloatingActionButtonBuild(
                mText = "Text Extended FAB",
                mModifier = Modifier.padding(4.dp),
                mContentColor = Color.Yellow
        )
    }

    @Composable
    fun ColoredExtendedFloatingActionButtonComponent() {
        ExtendedFloatingActionButtonComponent().ExtendedFloatingActionButtonBuild(
                mText = "Colored",
                mBackgroundColor = Color.Yellow,
                mContentColor = Color.Black
        )
    }

    @Composable
    fun IconExtendedFloatingActionButtonComponent() {
        ExtendedFloatingActionButtonComponent().ExtendedFloatingActionButtonBuild(
                mText = "Icon",
                mIcon = Icons.Default.ShoppingCart,
                mIconModifier = Modifier.padding(2.dp),
                mIconTint = Color.Red,
                mBackgroundColor = Color.LightGray,
                mContentColor = Color.Red
        )
    }

    @Composable
    fun ShapeExtendedFloatingActionButtonComponent() {
        ExtendedFloatingActionButtonComponent().ExtendedFloatingActionButtonBuild(
                mText = "Shape",
                mIcon = Icons.Default.Refresh,
                mIconTint = Color.White,
                mShape = RectangleShape,
                mContentColor = Color.White
        )
    }

    @Composable
    fun ElevatedExtendedFloatingActionButtonComponent() {
        ExtendedFloatingActionButtonComponent().ExtendedFloatingActionButtonBuild(
                mText = "Elevated",
                mIcon = Icons.Default.Share,
                mIconTint = Color.Black,
                mBackgroundColor = Color.White,
                mContentColor = Color.Black,
                mElevation = 8.dp
        )
    }
}