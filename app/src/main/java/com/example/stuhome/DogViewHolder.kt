package com.example.stuhome

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.stuhome.databinding.ItemdogBinding
import com.squareup.picasso.Picasso

class DogViewHolder (view:View):RecyclerView.ViewHolder(view){

    private  val binding= ItemdogBinding.bind(view)

    fun bind(image:String) {
        Picasso.get().load(image).into(binding.ivDog)
    }
}


// La función bind() llamará desde el adapter
// y le pasará una url en formato String,
// una vez dentro usaremos la librería de Picasso
// para cargar esa URL en nuestro iVDog.