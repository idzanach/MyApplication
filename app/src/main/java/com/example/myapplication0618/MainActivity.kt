package com.example.myapplication0618

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val imageButtonChoiceWorld = findViewById<ImageButton>(R.id.imageButtonChoiceWorld)
        // есть кнопка
        imageButtonChoiceWorld.setOnClickListener{
            val intent = Intent(this, WorldsActivity::class.java)
            startActivity(intent)
        }
        val imageButtonSetting = findViewById<ImageButton>(R.id.imageButtonSetting)
        imageButtonSetting.setOnClickListener{
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }



    }


}