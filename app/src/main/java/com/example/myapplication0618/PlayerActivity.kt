package com.example.myapplication0618


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceActivity
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.`KotlinPackage-Extensions-6da2b0d6`.jacksonObjectMapper
import java.io.File

class PlayerActivity : AppCompatActivity(){

    data class Character(
        //@SerializedName("name")
        val name: String,
        //@SerializedName("health")
        val health: Int,
        //@SerializedName("strength")
        val strength: Int,

    )
    val mapper = jacksonObjectMapper()

    var character = Character("Player_1", 100, 18)

    val name_player = findViewById<TextView>(R.id.textName)

    val imageButtonSetting = findViewById<ImageButton>(R.id.imageButtonSetting)

    val minus_HP = findViewById<Button>(R.id.minus_HP)
    val plus_HP = findViewById<Button>(R.id.plus_HP)
    val value_HP  = findViewById<TextView>(R.id.textStateHP)

    val minus_Strength = findViewById<Button>(R.id.minus_Strength)
    val plus_Strength = findViewById<Button>(R.id.plus_Strength)
    val value_Strength  = findViewById<TextView>(R.id.textStateStrength)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)
        val imageButton = findViewById<ImageButton>(R.id.imageButtonBack)
        // есть кнопка
        imageButton   .setOnClickListener{
            val intent = Intent(this, WorldActivity::class.java)
            startActivity(intent)
        }

        name_player.setText(character.name)

        imageButtonSetting.setOnClickListener{
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
        minus_HP.setOnClickListener {
            character = character.copy(strength = character.health - 1)
            value_HP.setText(character.strength.toString())
        }
        plus_HP.setOnClickListener {
            character = character.copy(strength = character.health + 1)
            value_HP.setText(character.strength.toString())
        }
        minus_Strength.setOnClickListener {
            character = character.copy(strength = character.strength - 1)
            value_Strength.setText(character.strength.toString())
        }
        plus_Strength.setOnClickListener {
            character = character.copy(strength = character.strength + 1)
            value_Strength.setText(character.strength.toString())
        }

    }
    fun whenSerializeCharacter_thenSuccess(character_0 : Character ) : String {

        val serialized = mapper.writeValueAsString(character_0)
        return serialized
    }
    fun addnewfile(string: String, file_name: String) {
        val HEADER = string

        var filename = file_name + ".txt"

        var path = getExternalFilesDir(null)

        var fileOut = File(path, filename)

        fileOut.delete()

        fileOut.createNewFile()

        fileOut.appendText(HEADER)
        fileOut.appendText("\n")
    }
  fun readstringfromfile(name: String, path: String){
      var file = File(path, name)
      file.readText()
  }
    fun whenDeserializeMovie_thenSuccess(json: String) : Character {
        val character_0: Character = mapper.readValue(json, Character::class.java)
     return character_0
    }
}



