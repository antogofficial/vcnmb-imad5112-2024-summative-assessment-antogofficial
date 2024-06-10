package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Spinner
import android.widget.TextView

class MainActivityStart : AppCompatActivity() {

    val dayOfTheWeek = arrayListOf<String>("Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
        "Sunday",)

    val weatherCondition = arrayListOf<String>("Sunny", //  (Stack Overflow, n.d.)
        "Rainy",
        "Partly Cloudy",
        "Sunny",
        "Cloudy",
        "Snowy",
        "Foggy") // (Stack Overflow, n.d.)

    val temperature = arrayListOf<String>("10", // (Stack Overflow, n.d.)
        "12",
        "15",
        "19",
        "30",
        "33",
        "25",) // (Stack Overflow, n.d.)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_start)

        val spinnerDayfTheWeek = findViewById<Spinner>(R.id.spinnerDayOfTheWeek)
        Log.v("${spinnerDayfTheWeek}", "Spinner to display the days of the week") //(The IIE, 2024)
        val textViewDisplay = findViewById<TextView>(R.id.textViewDisplay)
        Log.v("${textViewDisplay}", "Text view to show the user where to select a day") //(The IIE, 2024)
        val textViewForecast = findViewById<TextView>(R.id.textViewForecast)
        Log.v("${textViewForecast}", "Text view to show the user the forecast for a selected day") //(The IIE, 2024)
        val textViewTemparature = findViewById<TextView>(R.id.textViewTemparature)
        Log.v("${textViewTemparature}", "Text view to show the temperature to the user for a specific day") //(The IIE, 2024)




    }
}

/*
The IIE. 2024.Introduction to Mobile Application Development [IMAD5112 Module Manual].
The Independent Institute of Education:Unpublished [Accessed 10 June 2024]

Stack Overflow. (n.d.). How to close Android application in Kotlin. [online]
Available at: https://stackoverflow.com/questions/51831820/how-to-close-android-application-in-kotlin.
[Accessed 10 June 2024]
 */