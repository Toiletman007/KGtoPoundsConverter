package com.example.kgtopoundsconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ttl: TextView = findViewById(R.id.title)
        val userInputKG: EditText = findViewById(R.id.kiloEditText)
        val btn: Button = findViewById(R.id.btn)
        val userOutputLBs: TextView = findViewById(R.id.poundsTextView)





    }
}