package com.example.jetpackmasterclass

import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.nativeCanvas

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Canvas(modifier = Modifier.fillMaxSize()) {
                drawContext.canvas.nativeCanvas.apply {
                    drawText(
                        "Canvas Text",
                        100f,
                        100f,
                        Paint().apply {
                            color = android.graphics.Color.RED
                            textSize = 100f
                        }
                    )
                }
            }
        }
    }
}
