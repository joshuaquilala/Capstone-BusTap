package com.example.capstone_bustap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class CreateAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        val CreateSignUpButton = findViewById<ImageButton>(R.id.CreateSignUpButton)



        CreateSignUpButton.setOnClickListener{
            val intent = Intent(this, Authentication::class.java)
            startActivity(intent)
        }
    }
}