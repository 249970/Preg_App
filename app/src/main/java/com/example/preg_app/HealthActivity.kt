package com.example.preg_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HealthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_health)
    }
}