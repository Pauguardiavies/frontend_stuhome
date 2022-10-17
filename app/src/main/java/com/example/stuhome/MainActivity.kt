package com.example.stuhome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button=findViewById(R.id.login)
        btn.setOnClickListener{

            val intent:Intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)


        }
    }
}