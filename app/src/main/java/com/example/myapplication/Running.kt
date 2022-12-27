package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class Running : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_running)
        val tx_show = findViewById<TextView>(R.id.textView)
        val ed_gt = findViewById<EditText>(R.id.editTextTextPersonName)
        val btn_send = findViewById<Button>(R.id.btn_send)
        val tx_time = findViewById<TextView>(R.id.tx_time)


        val countDownTimer:CountDownTimer
        var countDT: Long = 61000
        var countIl: Long = 1000
        val checkSrt = false


        val sh1 = "我們一般認為，抓住了問題的關鍵，其他一切則會迎刃而解。孟子說過一句很有意思的話，吾善養浩然之氣。這段話可說是震撼了我。禮記曾講過，正已而不求於人。我希望諸位也能好好地體會這句話。貝倫森在過去曾經講過，我願意手拿帽子站在街角，請過路人把他們用不完的時間投在裡面。帶著這句話，我們還要更加慎重的審視這個問題。在這種困難的抉擇下，本人思來想去，寢食難安。問題的核心究竟是什麼？盧克萊修曾說過，宗教能使人做出如此多的惡事與危害。這句話決定了一切。若無法徹底理解勞贖，恐怕會是人類的一大遺憾。"
        val sh2 = "說到一起喵喵喵，你會想到什麼呢？需要考慮周詳一起喵喵喵的影響及因應對策。若發現問題比我們想像的還要深奧，那肯定不簡單。探討一起喵喵喵時，如果發現非常複雜，那麼想必不簡單。李大釗曾經提過，過去與將來，都是那無始無終永遠流轉的大自然在人生命上比較出來的程序，其中間都有一個連續不斷的生命力。一線相貫，不可分拆，不可斷滅。這是撼動人心的。"
        val sh3 = "動機，可以說是最單純的力量。對於一般人來說，八尬譨譨究竟象徵著什麼呢？華羅庚曾經說過，搞科學、做學問，要“不空不鬆，從嚴以終”，要很嚴格地搞一輩子工作。但願諸位理解後能從中有所成長。就我個人來說，八尬譨譨對我的意義，不能不說非常重大。"


        tx_show.text = "我們一般認為，抓住了問題的關鍵，其他一切則會迎刃而解。孟子說過一句很有意思的話，吾善養浩然之氣。這段話可說是震撼了我。禮記曾講過，正已而不求於人。我希望諸位也能好好地體會這句話。貝倫森在過去曾經講過，我願意手拿帽子站在街角，請過路人把他們用不完的時間投在裡面。帶著這句話，我們還要更加慎重的審視這個問題。在這種困難的抉擇下，本人思來想去，寢食難安。問題的核心究竟是什麼？盧克萊修曾說過，宗教能使人做出如此多的惡事與危害。這句話決定了一切。若無法徹底理解勞贖，恐怕會是人類的一大遺憾。"

        countDownTimer = object : CountDownTimer(countDT,countIl){
            override fun onTick(p0: Long) {
                tx_time.text = (p0/1000).toString()


            }

            override fun onFinish() {
                tx_time.text = ""
                resetPr()

            }
        }
        countDownTimer.start()

        btn_send.setOnClickListener({
            resetPr()
            countDownTimer.cancel()
        })


    }


    private fun resetPr(){
        val ed_gt = findViewById<EditText>(R.id.editTextTextPersonName)
        val intent = Intent(this, Result::class.java)
        val intext = ed_gt.text.toString()
        intent.putExtra("content",intext)
        startActivity(intent)
    }


}