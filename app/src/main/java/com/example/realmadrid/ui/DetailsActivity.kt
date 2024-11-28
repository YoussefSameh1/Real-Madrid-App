package com.example.realmadrid.ui

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.realmadrid.R

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val playerImage = findViewById<ImageView>(R.id.player_image)
        val playerName = findViewById<TextView>(R.id.name)
        val playerAge = findViewById<TextView>(R.id.age)
        val playerKitNumber = findViewById<TextView>(R.id.kitNumber)
        val playerHeight = findViewById<TextView>(R.id.height)
        val playerPosition = findViewById<TextView>(R.id.position)
        val playerNationality = findViewById<TextView>(R.id.nation)

        val intent = this.intent
        if (intent != null) {
            val image = intent.getIntExtra("image", R.drawable.lunin)
            val name = intent.getStringExtra("name")
            val age = intent.getIntExtra("age", 1)
            val kitNumber = intent.getIntExtra("kitNumber", 1)
            val height = intent.getStringExtra("height")
            val position = intent.getStringExtra("position")
            val nationality = intent.getStringExtra("nationality")

            playerImage.setImageResource(image)
            playerName.text = name
            playerAge.text = age.toString()
            playerKitNumber.text = kitNumber.toString()
            playerHeight.text = height
            playerPosition.text = position
            playerNationality.text = nationality
        }
    }

    fun back(view: View?) {
        onBackPressed()
    }
}
