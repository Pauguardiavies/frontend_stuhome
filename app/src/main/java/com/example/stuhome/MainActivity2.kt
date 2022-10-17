package com.example.stuhome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)



        val btnBack: Button = findViewById(R.id.button_back)
        btnBack.setOnClickListener {

            val intentBack: Intent = Intent(this, MainActivity::class.java)
            startActivity(intentBack)

        }
            val btnForward: Button = findViewById(R.id.button_forward)
            btnForward.setOnClickListener {

                val intentForward:Intent = Intent(this, MainActivity3::class.java)
                startActivity(intentForward)
            }

        }}






