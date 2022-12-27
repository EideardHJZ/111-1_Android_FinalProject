package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myButton = findViewById<Button>(R.id.myButton)

        myButton.setOnClickListener {
            //從當前Activity跳轉到SecondActivity
            val intent = Intent(this, Running::class.java)
            //startActivity()方法專門用於啓動Activity
            //他接受一個Intent參數
            startActivity(intent)
        }
    }
}