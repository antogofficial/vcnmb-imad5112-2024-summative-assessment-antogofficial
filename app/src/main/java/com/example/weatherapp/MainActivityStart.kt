package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivityStart : AppCompatActivity() {

  enum class dayOfTheWeek {
        Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday,
}

    val weatherCondition = arrayListOf<String>("Sunny",
        "Rainy",
        "Partly Cloudy",
        "Sunny",
        "Cloudy",
        "Snowy",
        "Foggy")

    val temperature = arrayListOf<String>("10",
        "12",
        "15",
        "19",
        "30",
        "33",
        "25",)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_start)

        val spinnerDayfTheWeek = findViewById<Spinner>(R.id.spinnerDayOfTheWeek)
        val textViewForecast = findViewById<TextView>(R.id.textViewForecast)

    }
}