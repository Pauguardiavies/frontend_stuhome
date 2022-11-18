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