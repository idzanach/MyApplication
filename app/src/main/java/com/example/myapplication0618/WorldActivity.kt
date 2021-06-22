package com.example.myapplication0618

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class WorldActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_world)
        val imageButton = findViewById<ImageButton>(R.id.imageButtonBack)
        // есть кнопка
        imageButton   .setOnClickListener{
            val intent = Intent(this, WorldsActivity::class.java)
            startActivity(intent)
        }

        val imageButtonSetting = findViewById<ImageButton>(R.id.imageButtonSetting)
        imageButtonSetting.setOnClickListener{
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }

        val imageButtonPlayer1 = findViewById<ImageButton>(R.id.imageButtonPlayer1)
        imageButtonPlayer1.setOnClickListener{
            val intent = Intent(this, PlayerActivity::class.java)
            startActivity(intent)
        }

        val imageButtonPlayer2 = findViewById<ImageButton>(R.id.imageButtonPlayer2)
        imageButtonPlayer2.setOnClickListener{
            val intent = Intent(this, PlayerActivity::class.java)
            startActivity(intent)
        }
    }
}