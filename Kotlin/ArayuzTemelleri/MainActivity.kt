package com.cumaliatalan.arayuztemelleri

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var numara =0
    var runnable : Runnable = Runnable {}
    var handler = Handler(Looper.myLooper()!!)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun baslat(view: View){
        numara =0
        runnable = object : Runnable{
            override fun run() {
                numara +=1
                textView.text = "Sayaç: ${numara}"
                handler.postDelayed(runnable, 1000)
            }

        }
        handler.post(runnable)
    }

    fun dur(view: View){
        handler.removeCallbacks(runnable)
        numara =0
        textView.text = "Sayaç: 0"
    }

}