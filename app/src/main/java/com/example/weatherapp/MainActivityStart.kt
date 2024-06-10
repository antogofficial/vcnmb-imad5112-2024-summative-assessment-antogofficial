package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivityWeather : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_start)

        val buttonStart = findViewById<Button>(R.id.buttonStart)

        buttonStart.setOnClickListener() {

            val intext = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}