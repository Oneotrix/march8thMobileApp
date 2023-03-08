package com.application.march8th

import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextPaint
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.txt)

        val paint: TextPaint = textView.paint
        val width = paint.measureText(textView.text.toString())
        val textShader: Shader = LinearGradient(
            0f, 0f, width, textView.textSize,
            intArrayOf( Color.rgb(255, 212, 185), Color.rgb(254, 167, 160),
                        Color.rgb(254, 166, 204), Color.rgb(237, 106, 184)),
            null, Shader.TileMode.CLAMP
        )

        textView.paint.shader = textShader
        textView.invalidate()
    }
}