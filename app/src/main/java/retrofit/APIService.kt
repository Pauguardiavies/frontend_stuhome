package retrofit

import com.example.stuhome.DogsResponse
import com.example.stuhome.Miembros
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url
//con esta interfaz conectamos a nuestra api.
interface APIService {
@GET
//añadimos un suspend para que sea asincrona
suspend fun getDogsByBreeds(@Url url: String):Response<DogsResponse>

}

// suspend, esta será necesaria para trabajar con corrutinas, es decir, siempre que queramos hacer llamadas en segundo plano usando corrutinas tendremos que añadirla para que funcione nuestro código.
//ttodo lo que venga de Retrofit lo capturaremos a través de la clase Response (DogsResponse)