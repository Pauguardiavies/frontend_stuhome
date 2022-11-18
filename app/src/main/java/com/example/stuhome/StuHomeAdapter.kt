package com.example.stuhome

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy

class StuHomeAdapter:RecyclerView.Adapter <StuHomeAdapter.ViewHolder>(){

    val  titles= arrayOf(
        "Jiahan Chen",
        "Lhuis Marcelo",
        "Pau Guardia")
    val  info= arrayOf(
        "Programador BackEnd experto en Spring y Tomcat",
        "Programador FrontEnd experto en Kotlin y Android Studio",
        "Programador  experto en el estudio de mercado.")
    val  images= intArrayOf(
        R.drawable.aboutsus,
        R.drawable.aboutsus,
        R.drawable.aboutsus
      )


    //Se llama cuando el recycler view requiera de una  nueva vista para mostrar algo en pantalla
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
    val view= LayoutInflater
        .from(viewGroup.context)
        .inflate(R.layout.card_layout,viewGroup,false)

        return ViewHolder(view)
    }
    //Actualizar datos de una vista
    override fun onBindViewHolder(viewHolder:ViewHolder, i: Int) {
        viewHolder.profileTitle.text=titles[i]
        viewHolder.profileInfo.text=info[i]
        viewHolder.profileImg.setImageResource(images[i])
    }
    //Numero de elementos de una lista
    override fun getItemCount(): Int {
        return titles.size
    }
    inner class  ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var profileImg:ImageView
    var profileTitle:TextView
    var profileInfo:TextView


    init{

        profileImg=itemView.findViewById(R.id.profile_img)
        profileTitle=itemView.findViewById(R.id.profile_title)
        profileInfo=itemView.findViewById(R.id.profile_info)
    }

    }
}
