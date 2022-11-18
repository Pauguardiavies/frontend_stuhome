package com.example.stuhome

import com.google.gson.annotations.SerializedName

//Transformamos a data class y pasamos los parametros de tengamos en la API
data class DogsResponse(
    @SerializedName("status") var status: String,
    @SerializedName("message")var images:List<String>
)

        // Con SerializedName podemos darle otro  nombre a las variables del data class y no las del api
        // :value , aquí es donde añadiremos los parametros del api para que conecte nuestras variables con las de la api
