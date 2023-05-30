package com.example.tute_08

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnClick: Button
    lateinit var tvMessage: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnClick = findViewById(R.id.btnClick)
        tvMessage = findViewById(R.id.tvMessage)

        btnClick.setOnClickListener() {
            tvMessage.text = "Hello, User!"
        }


    }
}