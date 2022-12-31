package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        //val tx_result = findViewById<TextView>(R.id.textView6)
        val btnBack = findViewById<Button>(R.id.btnBack)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val tvRate = findViewById<TextView>(R.id.tvRate)
        val tvResultTime = findViewById<TextView>(R.id.tvResultTime)
        val tvYourResult = findViewById<TextView>(R.id.tvYourResult)
        val yourAns: String? = intent.getStringExtra("content")
        val article: String? = intent.getStringExtra("articleTXT")
        val time: String? = intent.getStringExtra("time")
        val yourlen: Int? = yourAns?.length
        var anscnt = 0;

        tvResult.text = article

        for (i in 0 until (yourlen!!))
        {
           if(yourAns[i] == article?.get(i))
           {
               anscnt += 1
           }
        }
        tvYourResult.text = yourAns
        tvRate.text = "準確率\n " + (anscnt * 100/article!!.length).toString() + "%"
        tvResultTime.text = (60 - time!!.toInt()).toString()



        btnBack.setOnClickListener {
            val back = Intent(this, MainActivity::class.java)
            startActivity(back)
        }

        //tvResult.text = "60秒內輸入的文字:$name\n處理用名稱為content\n\n原始文章內容為:$artical\n處理用名稱為articalTXT"
    }
}