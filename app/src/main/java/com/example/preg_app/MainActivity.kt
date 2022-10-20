package com.example.preg_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val healthButton = findViewById<ImageButton>(R.id.btnHealth)
        val calendarButton = findViewById<ImageButton>(R.id.btnCalendar)
        val guideButton = findViewById<ImageButton>(R.id.btnGuide)
        val settingsButton = findViewById<ImageButton>(R.id.btnSettings)

        healthButton.setOnClickListener{
            val intent = Intent(this, HealthActivity::class.java)
            startActivity(intent)
        }

        calendarButton.setOnClickListener{
            val intent = Intent(this, CalendarActivity::class.java)
            startActivity(intent)
        }

        guideButton.setOnClickListener{
            val intent = Intent(this, GuideActivity::class.java)
            startActivity(intent)
        }

        settingsButton.setOnClickListener{
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }

    }



}