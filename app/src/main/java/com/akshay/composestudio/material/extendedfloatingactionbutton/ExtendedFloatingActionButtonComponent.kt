package com.akshay.composestudio.material.extendedfloatingactionbutton

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.graphics.Color
import androidx.ui.graphics.Shape
import androidx.ui.graphics.vector.VectorAsset
import androidx.ui.layout.padding
import androidx.ui.material.ExtendedFloatingActionButton
import androidx.ui.material.MaterialTheme
import androidx.ui.unit.Dp
import androidx.ui.unit.dp

class ExtendedFloatingActionButtonComponent : ExtendedFloatingActionButtonComposableLayout {

    @Composable
    override fun ExtendedFloatingActionButtonBuild(
            mText: String?,
            mModifier: Modifier?,
            mIcon: VectorAsset?,
            mIconModifier: Modifier?,
            mIconTint: Color?,
            mShape: Shape?,
            mBackgroundColor: Color?,
            mContentColor: Color?,
            mElevation: Dp?
    ) {
        ExtendedFloatingActionButton(
                text = {
                    mText?.let {
                        Text(text = it)
                    }
                },
                onClick = {

                },
                modifier = mModifier ?: Modifier.padding(0.dp),
                icon = {
                    mIcon?.let {
                        Icon(
                                asset = it,
                                modifier = mIconModifier ?: Modifier.padding(0.dp),
                                tint = mIconTint ?: Color.White
                        )
                    }
                },
                shape = mShape ?: CircleShape,
                backgroundColor = mBackgroundColor ?: MaterialTheme.colors.primary,
                contentColor = mContentColor ?: Color.White,
                elevation = mElevation ?: 0.dp
        )
    }
}