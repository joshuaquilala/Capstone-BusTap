package com.example.capstone_bustap

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class FunctionGrid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_function_grid)


        val FindBusButton = findViewById<ImageButton>(R.id.FindBusButton)
        val PickMeButton = findViewById<ImageButton>(R.id.PickMeButton)
        val TrackBusButton = findViewById<ImageButton>(R.id.TrackBusButton)
        val CheckSchedButton = findViewById<ImageButton>(R.id.CheckSchedButton)


        FindBusButton.setOnClickListener{
            val intent = Intent(this, FindBus::class.java)
            startActivity(intent)
        }
        PickMeButton.setOnClickListener{
            val intent = Intent(this, PickMeUp::class.java)
            startActivity(intent)
        }
        TrackBusButton.setOnClickListener{
            val intent = Intent(this, TrackBus::class.java)
            startActivity(intent)
        }
        CheckSchedButton.setOnClickListener{
            val intent = Intent(this, TrackBus::class.java)
            startActivity(intent)
        }

    }


}