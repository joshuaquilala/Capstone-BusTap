package com.example.capstone_bustap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val SignInButton = findViewById<Button>(R.id.SignInButton)
        val SignUpButton = findViewById<Button>(R.id.SignUpButton)

        SignInButton.setOnClickListener{
            Toast.makeText(this, "Signing In", Toast.LENGTH_LONG)
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        SignUpButton.setOnClickListener{
            Toast.makeText(this, "Singing Up", Toast.LENGTH_LONG)
            val intent = Intent(this, CreateAccount::class.java)
            startActivity(intent)
        }
        }
    }