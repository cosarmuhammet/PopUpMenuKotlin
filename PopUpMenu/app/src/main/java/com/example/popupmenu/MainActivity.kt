package com.example.popupmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var popupac = findViewById<Button>(R.id.popupac)

        popupac.setOnClickListener{
            val popup = PopupMenu(applicationContext,popupac)
            popup.menuInflater.inflate(R.menu.popupmenu,popup.menu)
            popup.setOnMenuItemClickListener { i ->
            when(i.itemId){
                R.id.kirmizi -> {
                    Toast.makeText(applicationContext,"Kirmizi secildi",Toast.LENGTH_LONG).show()
                    true
                }
                R.id.mavi -> {
                    Toast.makeText(applicationContext,"Mavi secildi",Toast.LENGTH_LONG).show()
                    true
                }
                R.id.yesil -> {
                    Toast.makeText(applicationContext,"Yesil secildi",Toast.LENGTH_LONG).show()
                    true
                }
                //digerlerini de kopyala
                else -> false

            }

            }
            popup.show()
        }

    }
}