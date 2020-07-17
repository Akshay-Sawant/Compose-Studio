package com.akshay.composestudio.material.iconandicontogglebutton

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Icon
import androidx.ui.graphics.Color
import androidx.ui.graphics.vector.VectorAsset
import androidx.ui.layout.padding
import androidx.ui.material.IconButton
import androidx.ui.material.IconToggleButton
import androidx.ui.unit.dp

object IconAndIconToggleButtonComponent : IconAndIconToggleButtonComposableLayout {

    @Composable
    override fun IconButtonBuild(
            mModifier: Modifier?,
            mIconModifier: Modifier?,
            mIconAsset: VectorAsset?,
            mIconTint: Color?
    ) {
        IconButton(
                onClick = {

                },
                modifier = mModifier ?: Modifier.padding(0.dp),
                icon = {
                    mIconAsset?.let {
                        Icon(
                                asset = it,
                                modifier = mIconModifier ?: Modifier.padding(0.dp),
                                tint = mIconTint ?: Color.Black
                        )
                    }
                }
        )
    }

    @Composable
    override fun IconToggleButtonBuild(
            mChecked: Boolean?,
            mEnabled: Boolean?,
            mModifier: Modifier?,
            mIconModifier: Modifier?,
            mIconAsset: VectorAsset?,
            mIconTint: Color?
    ) {
        IconToggleButton(
                checked = mChecked ?: false,
                onCheckedChange = {

                },
                enabled = mEnabled ?: false,
                modifier = mModifier ?: Modifier.padding(0.dp),
                icon = {
                    mIconAsset?.let {
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