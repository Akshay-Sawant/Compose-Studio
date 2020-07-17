package com.akshay.composestudio.material.floatigactionbutton

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Icon
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.graphics.Color
import androidx.ui.graphics.Shape
import androidx.ui.graphics.vector.VectorAsset
import androidx.ui.layout.padding
import androidx.ui.material.FloatingActionButton
import androidx.ui.unit.Dp
import androidx.ui.unit.dp

class FloatingActionButtonComponent : FloatingActionButtonComposableLayout {

    @Composable
    override fun FloatingActionButtonBuild(
            mModifier: Modifier?,
            mShape: Shape?,
            mBackgroundColor: Color?,
            mContentColor: Color?,
            mElevation: Dp?,
            mIcon: VectorAsset?,
            mIconModifier: Modifier?,
            mIconTint: Color?
    ) {
        FloatingActionButton(
                onClick = {

                },
                modifier = mModifier ?: Modifier.padding(0.dp),
                shape = mShape ?: CircleShape,
                backgroundColor = mBackgroundColor ?: Color.DarkGray,
                contentColor = mContentColor ?: Color.Black,
                elevation = mElevation ?: 0.dp,
                icon = {
                    mIcon?.let {
                        Icon(
                                asset = it,
                                modifier = mIconModifier ?: Modifier.padding(0.dp),
                                tint = mIconTint ?: Color.Black
                        )
                    }

                }
        )
    }
}