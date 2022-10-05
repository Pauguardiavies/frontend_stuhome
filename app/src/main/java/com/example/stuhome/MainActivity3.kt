package com.example.stuhome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        val btn: Button =findViewById(R.id.button_home)
        btn.setOnClickListener{

            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
    }
        val btn2: Button =findViewById(R.id.button_end)
        btn2.setOnClickListener {

            val intent2: Intent = Intent(Intent.ACTION_MAIN)
            intent2.addCategory(Intent.CATEGORY_HOME);
            intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            finish();

            startActivity(intent2);
        }




            }
    }