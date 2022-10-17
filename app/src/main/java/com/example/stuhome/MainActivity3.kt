package com.example.stuhome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.supportActionBar?.hide()
        setContentView(R.layout.activity_main3)

        val recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
        val adapter=StuHomeAdapter()

        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=adapter
        val btn: Button =findViewById(R.id.button_home)
        btn.setOnClickListener{

            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
    }
       /* val btn2: Button =findViewById(R.id.button_end)
        btn2.setOnClickListener {

            val intent2: Intent = Intent(Intent.ACTION_MAIN)
            intent2.addCategory(Intent.CATEGORY_HOME);
            intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            finish();

            startActivity(intent2);*/
        }




            }
