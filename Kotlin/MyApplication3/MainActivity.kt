package com.cumaliatalan.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var sayi1 : Int? = null
    var sayi2 : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toplama(view : View) {

        sayi1 = editText1.text.toString().toIntOrNull()
        sayi2 = editText2.text.toString().toIntOrNull()
        if(sayi1 == null || sayi2 == null){
            sonucText.text = "Sayi girmeyi unuttun!"
        }else{
            var sonuc = sayi1!! + sayi2!!
            sonucText.text = "${sonuc}"
        }
    }

    fun cikarma(view : View) {
        sayi1 = editText1.text.toString().toIntOrNull()
        sayi2 = editText2.text.toString().toIntOrNull()

        if(sayi1 == null || sayi2 == null){
            sonucText.text = "sayi girmeyi unuttun"
        }else{
            var sonuc = sayi1!! - sayi2!!
            sonucText.text = "${sonuc}"
        }
    }

    fun carpma(view : View) {
        sayi1 = editText1.text.toString().toIntOrNull()
        sayi2 = editText2.text.toString().toIntOrNull()

        if(sayi1 == null || sayi2 == null){
            sonucText.text = "sayi girmeyi unuttun"
        }else{
            val sonuc = sayi1!! * sayi2!!
            sonucText.text = "${sonuc}"
        }
    }

    fun bolme(view : View) {
        sayi1 = editText1.text.toString().toIntOrNull()
        sayi2 = editText2.text.toString().toIntOrNull()

        if(sayi1 == null || sayi2 == null){
            sonucText.text = "sayi girmeyi unuttun"
        }else{
            val sonuc = sayi1!! / sayi2!!
            sonucText.text = "${sonuc}"
        }
    }

/*    fun degistir(view : View){
        val toplamaSonucu = toplama(10, 40)
    }

    fun olustur(view : View){
        val isim = sayi1.text.toString()
        val yas = sayi2.text.toString().toIntOrNull()
        val meslek = meslekText.text.toString()

        if(yas == null){
            sonucText.text = "Dogru Yasi Giriniz"
        }else{
            val superKahraman = SuperKahraman(isim, yas!!, meslek)
            sonucText.text = "İsim: ${isim} \nYas: ${yas} \nMeslek: ${meslek}"
        }
    }

    fun nullGuvenligi(){
        var benimString : String
        benimString = "cumali"
        benimString.length
    }*/
}
