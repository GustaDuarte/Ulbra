package br.com.ulbra.apicomretrofit.data.network

import br.com.ulbra.apicomretrofit.data.network.responses.CharactersResponse
import retrofit2.http.GET

interface CharactersApi {
    @GET("characters")
    suspend fun fetchCharacters(): List<CharactersResponse>
}