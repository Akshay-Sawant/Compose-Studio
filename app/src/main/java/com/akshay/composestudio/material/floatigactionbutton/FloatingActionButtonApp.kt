package com.akshay.composestudio.material.floatigactionbutton

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.shape.RectangleShape
import androidx.ui.graphics.Color
import androidx.ui.layout.padding
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.Call
import androidx.ui.material.icons.filled.CheckCircle
import androidx.ui.material.icons.filled.ShoppingCart
import androidx.ui.unit.dp

class FloatingActionButtonApp {

    @Composable
    fun Build() {
        DefaultFloatingActionButtonComponent()
        ColoredFloatingActionButtonComponent()
        IconFloatingActionButtonComponent()
        ShapeFloatingActionButtonComponent()
        ElevatedFloatingActionButtonComponent()
    }

    @Composable
    fun DefaultFloatingActionButtonComponent() {
        FloatingActionButtonComponent().FloatingActionButtonBuild()
    }

    @Composable
    fun ColoredFloatingActionButtonComponent() {
        FloatingActionButtonComponent().FloatingActionButtonBuild(
                mBackgroundColor = Color.Red
        )
    }

    @Composable
    fun IconFloatingActionButtonComponent() {
        FloatingActionButtonComponent().FloatingActionButtonBuild(
                mIcon = Icons.Default.CheckCircle,
                mIconModifier = Modifier.padding(8.dp),
                mIconTint = Color.Yellow
        )
    }

    @Composable
    fun ShapeFloatingActionButtonComponent() {
        FloatingActionButtonComponent().FloatingActionButtonBuild(
                mShape = RectangleShape,
                mBackgroundColor = Color.Blue,
                mIcon = Icons.Default.Call,
                mIconModifier = Modifier.padding(8.dp),
                mIconTint = Color.White
        )
    }

    @Composable
    fun ElevatedFloatingActionButtonComponent() {
        FloatingActionButtonComponent().FloatingActionButtonBuild(
                mBackgroundColor = Color.White,
                mElevation = 16.dp,
                mIcon = Icons.Default.ShoppingCart,
                mIconModifier = Modifier.padding(8.dp),
                mIconTint = Color.Red
        )
    }
}