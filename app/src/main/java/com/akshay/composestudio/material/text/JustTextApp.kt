package com.akshay.composestudio.material.text

import androidx.compose.Composable
import androidx.ui.foundation.Text
import androidx.ui.tooling.preview.Preview
import com.akshay.composestudio.ui.AppTheme

class JustTextApp {

    @Composable
    fun TextLayout(name: String) {
        Text(text = "Hello $name!")
    }

    @Preview
    @Composable
    fun DefaultPreview() {
        AppTheme {
            TextLayout("Jetpack. This is Just Text App")
        }
    }
}