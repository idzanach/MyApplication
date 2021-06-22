package com.example.myapplication0618

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class WorldsActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_worlds)
        val imageButton = findViewById<ImageButton>(R.id.imageButtonBack)
        // есть кнопка
        imageButton   .setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val imageButtonSetting = findViewById<ImageButton>(R.id.imageButtonSetting)
        imageButtonSetting.setOnClickListener{
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
        val imageButtonWorld1 = findViewById<ImageButton>(R.id.imageButtonWorld1)
        imageButtonWorld1.setOnClickListener{
            val intent = Intent(this, WorldActivity::class.java)
            startActivity(intent)
        }
        val imageButtonWorld2 = findViewById<ImageButton>(R.id.imageButtonWorld2)
        imageButtonWorld2.setOnClickListener{
            val intent = Intent(this, WorldActivity::class.java)
            startActivity(intent)
        }
    }
}