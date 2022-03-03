package com.cumaliatalan.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var benimInt : Int = 5
        var benimLong: Long = 10
        val benimString : String = "29"
        var benimBoolean : Boolean= true



        val yeniMap = hashMapOf<String, Int>("Cumali" to 40)


        
    }
}