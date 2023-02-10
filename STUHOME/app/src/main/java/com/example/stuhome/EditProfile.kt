package com.example.stuhome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton

class EditProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        //EditText de la pantalla edit profile.
        val EditUsernameEt= findViewById<EditText>(R.id.edit_username)
        val EditMailEt = findViewById<EditText>(R.id.edit_mail)
        val EditNameEt = findViewById<EditText>(R.id.edit_name)
        val EditSurnameEt = findViewById<EditText>(R.id.edit_surname)
        val EditDescriptionEt = findViewById<EditText>(R.id.edit_description)
        val EditDirectionEt = findViewById<EditText>(R.id.edit_direccion)

        //Buttones de edit profile.
        val saveChangesBtn: AppCompatButton = findViewById(R.id.profile_save_changesBtn)

    }
}