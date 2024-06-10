package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivityStart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_start)

        val buttonStart = findViewById<Button>(R.id.buttonStart)
        val buttonExit = findViewById<Button>(R.id.buttonExit)

        buttonStart.setOnClickListener() {

            val intext = Intent(this, MainActivityStart::class.java)

            startActivity(intent)

            buttonExit.setOnClickListener() {

                finishAffinity()

            }
        }
    }
}