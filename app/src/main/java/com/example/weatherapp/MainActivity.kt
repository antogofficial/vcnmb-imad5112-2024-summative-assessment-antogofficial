package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TableLayout
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonStart = findViewById<Button>(R.id.buttonStart)
        val buttonExit = findViewById<Button>(R.id.buttonExit)

        buttonStart.setOnClickListener() {

            val intent = Intent(this, MainActivityStart::class.java)

            startActivity(intent)

        }
    }
}