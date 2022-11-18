package com.example.stuhome

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy

class StuHomeViewHolder (view: View): RecyclerView.ViewHolder(view){
    val tv_nombre=view.findViewById<TextView>(R.id.tv_nombre)
    val tv_descripcion=view.findViewById<TextView>(R.id.tv_descripcion)
    val tv_telefono=view.findViewById<TextView>(R.id.tv_tel)
    val tv_email=view.findViewById<TextView>(R.id.tv_email)
    val iv_profile=view.findViewById<ImageView>(R.id.iv_profile)

    fun showMembers(miembros:Miembros){
        tv_nombre.text=miembros.infoMember
        tv_descripcion.text=miembros.descripcionMember
        tv_telefono.text=miembros.numTelefono
        tv_email.text=miembros.mail


        Glide.with(iv_profile.context).load(MiembrosProvider.rutaImatges+miembros.imagen)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop().into(iv_profile)
    }
}