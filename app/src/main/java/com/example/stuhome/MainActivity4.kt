package com.example.stuhome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.stuhome.databinding.ActivityMain2Binding
import com.example.stuhome.databinding.ActivityMain4Binding
import com.example.stuhome.databinding.ActivityMainBinding
import com.example.stuhome.databinding.LayoutDogsBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit.APIService
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity4 : AppCompatActivity(),SearchView.OnQueryTextListener {


    private lateinit var binding: LayoutDogsBinding;
    private lateinit var adapter:DogAdapter
    private val dogImages= mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=LayoutDogsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.svDogs.setOnQueryTextListener(this)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        adapter= DogAdapter(dogImages)
        binding.rvDogs.layoutManager=LinearLayoutManager(this)
        binding.rvDogs.adapter = adapter
    } //Llama el recyclerView

    //Creando Retrofit
    private  fun getRetrofit():Retrofit{

        return Retrofit.Builder()
            .baseUrl("https://dog.ceo/api/breeds/")
            .addConverterFactory(GsonConverterFactory.create()) //hace la conversion del json a DogsResponse
            .build()
    }
    //Creando Corutine,
    // para que  lo que hacemos dentro lo ejecute de manera secundaria
    private fun searchByName(query:String) {
        CoroutineScope(Dispatchers.IO).launch {
            val call: Response<DogsResponse> = getRetrofit().create(APIService::class.java).getDogsByBreeds("$query/images")
            val puppies: DogsResponse? = call.body()
            runOnUiThread {

                if (call.isSuccessful) {
                    val images = puppies?.images ?: emptyList()//Muestra recyclerview
                    dogImages.clear()   //en dog images se encuentra las imagenes que muestra el adapter
                    dogImages.addAll(images) //añade ttodo lo que tenga aqui
                    adapter.notifyDataSetChanged() //avisar al adapter de los cambios

                } else {
                    //muestra error
                    showError()
                }

            }

        }

    }
    private fun showError() {
        Toast.makeText(this, "Ha ocurrido un error", Toast.LENGTH_SHORT).show()
    }
    //Estos metodos nos avisan cuando el usuario realice un cambio
    override fun onQueryTextSubmit(query: String?): Boolean {
        if(!query.isNullOrEmpty()){
            searchByName(query.lowercase())
        }
        return true
        }

    override fun onQueryTextChange(newText: String?): Boolean {
    return true
    }
}