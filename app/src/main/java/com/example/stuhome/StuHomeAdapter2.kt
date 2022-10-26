package com.example.stuhome

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

//Esta clase se encarga de modificar el Recycler View
class StuHomeAdapter2(private val miembros:List<Miembros>):RecyclerView.Adapter<StuHomeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StuHomeViewHolder {

        //Transformem amb LayoutInflate el layout xml
        val layoutInflate = LayoutInflater.from(parent.context)

        return StuHomeViewHolder(layoutInflate.inflate(R.layout.layout_members,parent,false))
    }

    override fun onBindViewHolder(holder: StuHomeViewHolder, position: Int) {
    //con position se accedem a toda la lista, a todos los miembros
            holder.showMembers(miembros[position])

    }

    override fun getItemCount(): Int {

        return miembros.size
    }


}
