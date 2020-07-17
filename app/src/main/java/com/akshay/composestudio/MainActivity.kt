package com.akshay.composestudio

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxSize
import com.akshay.composestudio.ui.AppTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                Column(
                        verticalArrangement = Arrangement.SpaceEvenly,
                        horizontalGravity = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxSize()
                ) {
//                JustText().TextLayout(name = "Jetpack. This is Just Text App")
//                TheScroll().LayoutContainer()
//                    ButtonApp().Build()
//                    DividerApp().Build()
//                    IconAndIconToggleButtonApp().Build()
//                    FloatingActionButtonApp().Build()
//                    ExtendedFloatingActionButtonApp().Build()
                }
            }
        }
    }
}