package com.example.capstone_bustap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginactivity)


        val LoginButton = findViewById<Button>(R.id.LoginButton)

        LoginButton.setOnClickListener{
            val intent = Intent(this, FunctionGrid::class.java)
            startActivity(intent)
        }
    }
}