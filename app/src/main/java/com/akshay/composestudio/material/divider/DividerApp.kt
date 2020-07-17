package com.akshay.composestudio.material.divider

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.graphics.Color
import androidx.ui.layout.padding
import androidx.ui.unit.dp

class DividerApp {

    @Composable
    fun Build() {
        DividerComponent()
        ColoredDividerComponent()
        ThicknessDividerComponent()
        StartIndentDividerComponent()
        AllInOneDividerComponent()
    }


    @Composable
    fun DividerComponent() {
        DividerComponent.DividerBuild(
                mModifier = Modifier.padding(16.dp)
        )
    }

    @Composable
    fun ColoredDividerComponent() {
        DividerComponent.DividerBuild(
                mColor = Color.Red
        )
    }

    @Composable
    fun ThicknessDividerComponent() {
        DividerComponent.DividerBuild(
                mThickness = 4.dp
        )
    }

    @Composable
    fun StartIndentDividerComponent() {
        DividerComponent.DividerBuild(
                mStartIndent = 16.dp
        )
    }

    @Composable
    fun AllInOneDividerComponent() {
        DividerComponent.DividerBuild(
                mModifier = Modifier.padding(16.dp),
                mColor = Color.Blue,
                mThickness = 2.dp,
                mStartIndent = 8.dp
        )
    }
}