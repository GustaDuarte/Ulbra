package br.com.ulbra.apicomretrofit.data.network

import br.com.ulbra.apicomretrofit.data.network.responses.CharactersResponse
import br.com.ulbra.apicomretrofit.data.network.responses.ResultsResponse
import retrofit2.http.GET

interface CharactersApi {
    @GET("people")
    suspend fun fetchCharacters(): List<CharactersResponse>
}