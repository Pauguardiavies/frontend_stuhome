package com.example.stuhome

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StuHomeViewHolder (view: View): RecyclerView.ViewHolder(view){
    val tv_nombre=view.findViewById<TextView>(R.id.tv_nombre)
    val tv_descripcion=view.findViewById<TextView>(R.id.tv_descripcion)
    val tv_telefono=view.findViewById<TextView>(R.id.tv_tel)
    val tv_email=view.findViewById<TextView>(R.id.tv_email)

    fun showMembers(miembros:Miembros){
        tv_nombre.text=miembros.infoMember
        tv_descripcion.text=miembros.descripcionMember
        tv_telefono.text=miembros.numTelefono
        tv_email.text=miembros.mail
    }
}