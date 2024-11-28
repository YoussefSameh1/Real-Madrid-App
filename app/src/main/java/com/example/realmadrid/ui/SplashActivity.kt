package com.example.realmadrid.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.realmadrid.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        this.enableEdgeToEdge()

        Handler().postDelayed({
            val intent: Intent = Intent(
                this@SplashActivity,
                MainActivity::class.java
            )
            startActivity(intent)
            finish()
        }, 4000)
    }
}