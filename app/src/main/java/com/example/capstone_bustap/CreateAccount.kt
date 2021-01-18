package com.example.capstone_bustap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class CreateAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        val CreateNextButton = findViewById<Button>(R.id.CreateNextButton)
        val CreateBackButton = findViewById<Button>(R.id.CreateBackButton)

        CreateBackButton.setOnClickListener{
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        CreateNextButton.setOnClickListener{
            val intent = Intent(this, Authentication::class.java)
            startActivity(intent)
        }
    }
}