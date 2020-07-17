package com.akshay.composestudio.material.divider

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.graphics.Color
import androidx.ui.layout.padding
import androidx.ui.material.Divider
import androidx.ui.unit.Dp
import androidx.ui.unit.dp

object DividerComponent : DividerComposableLayout {

    @Composable
    override fun DividerBuild(
        mModifier: Modifier?,
        mColor: Color?,
        mThickness: Dp?,
        mStartIndent: Dp?
    ) {
        Divider(
            modifier = mModifier ?: Modifier.padding(0.dp),
            color = mColor ?: Color.Black,
            thickness = mThickness ?: 1.dp,
            startIndent = mStartIndent ?: 0.dp
        )
    }
}