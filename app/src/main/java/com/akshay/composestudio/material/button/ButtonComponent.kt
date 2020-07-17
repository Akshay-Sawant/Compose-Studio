package com.akshay.composestudio.material.button

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Border
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.CutCornerShape
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.graphics.Shape
import androidx.ui.layout.InnerPadding
import androidx.ui.material.*
import androidx.ui.unit.Dp
import androidx.ui.unit.dp

object ButtonComponent : ButtonComposableLayout {

    @Composable
    override fun ButtonBuild(
            mModifier: Modifier?,
            mBackgroundColor: Color?,
            mEnabled: Boolean?,
            mElevation: Dp?,
            mShape: Shape?,
            mBorder: Border?,
            mContentColor: Color?,
            mInnerPadding: InnerPadding?,
            mText: String?
    ) {
        Button(
                onClick = {

                },
                modifier = mModifier ?: Modifier,
                backgroundColor = mBackgroundColor ?: Color.White,
                enabled = mEnabled ?: false,
                elevation = mElevation ?: 0.dp,
                shape = mShape ?: RoundedCornerShape(0.dp),
                border = mBorder ?: Border(
                        size = 0.dp,
                        color = Color.Transparent
                ),
                contentColor = mContentColor ?: Color.White,
                padding = mInnerPadding ?: InnerPadding(),
                text = {
                    mText?.let {
                        Text(text = it)
                    }
                }
        )
    }

    @Composable
    override fun OutlinedButtonBuild(
            mModifier: Modifier?,
            mBackgroundColor: Color?,
            mEnabled: Boolean?,
            mElevation: Dp?,
            mShape: Shape?,
            mBorder: Border?,
            mContentColor: Color?,
            mInnerPadding: InnerPadding?,
            mText: String?
    ) {
        OutlinedButton(
                onClick = {

                },
                modifier = mModifier ?: Modifier,
                backgroundColor = mBackgroundColor ?: Color.White,
                enabled = mEnabled ?: false,
                elevation = mElevation ?: 0.dp,
                shape = mShape ?: CutCornerShape(0.dp),
                border = mBorder ?: Border(
                        size = 0.dp,
                        color = Color.Transparent
                ),
                contentColor = mContentColor ?: Color.White,
                padding = mInnerPadding ?: InnerPadding(),
                text = {
                    mText?.let {
                        Text(text = it)
                    }
                }
        )
    }

    @Composable
    override fun TextButtonBuild(
            mModifier: Modifier?,
            mBackgroundColor: Color?,
            mEnabled: Boolean?,
            mElevation: Dp?,
            mShape: Shape?,
            mBorder: Border?,
            mContentColor: Color?,
            mInnerPadding: InnerPadding?,
            mText: String?
    ) {
        TextButton(
                onClick = {

                },
                modifier = mModifier ?: Modifier,
                backgroundColor = mBackgroundColor ?: Color.White,
                enabled = mEnabled ?: false,
                elevation = mElevation ?: 0.dp,
                shape = mShape ?: CutCornerShape(0.dp),
                border = mBorder ?: Border(
                        size = 0.dp,
                        color = Color.Transparent
                ),
                contentColor = mContentColor ?: Color.White,
                padding = mInnerPadding ?: InnerPadding(),
                text = {
                    mText?.let {
                        Text(text = it)
                    }
                }
        )
    }
}