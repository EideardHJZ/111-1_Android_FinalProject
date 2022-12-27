package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tx_result = findViewById<TextView>(R.id.textView5)
        val name = intent.getStringExtra("content")

        tx_result.text = "60秒內輸入的文字，處理用：$name"

    }
}