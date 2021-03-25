package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val timer = Timer()
        val timerTask: TimerTask = object : TimerTask() {
            override fun run() {
                val intent = Intent(this@MainActivity, Sign_in::class.java)
                startActivity(intent)
            }
        }
        timer.schedule(timerTask, 2000L)
    }
}