package com.cumaliatalan.superkahraman

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_tanitim.*
import layout.RecyclerAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var superKahramanIsimleri = ArrayList<String>()
        superKahramanIsimleri.add("Batman")
        superKahramanIsimleri.add("Superman")
        superKahramanIsimleri.add("Iron Man")
        superKahramanIsimleri.add("Spiderman")

        var superKahramanGorselleri = ArrayList<Bitmap>()

        var layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val adapter = RecyclerAdapter(superKahramanIsimleri, superKahramanGorselleri)
        recyclerView.adapter = adapter
    }
}