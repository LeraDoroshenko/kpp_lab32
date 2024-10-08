package com.example.lab32

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private val daysOfWeek = listOf(
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
        "Sunday"
    )

    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewDays = findViewById<TextView>(R.id.textViewDays)
        val buttonNextDay = findViewById<Button>(R.id.buttonNextDay)

        textViewDays.text = daysOfWeek[currentIndex]

        buttonNextDay.setOnClickListener {
            currentIndex = (currentIndex + 1) % daysOfWeek.size
            textViewDays.text = daysOfWeek[currentIndex]
        }
    }
}