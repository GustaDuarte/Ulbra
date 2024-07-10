package br.com.ulbra.apicomretrofit.data.network

import br.com.ulbra.apicomretrofit.data.DemonSlayerCharacter
import br.com.ulbra.apicomretrofit.data.network.responses.ResultsResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface CharactersApi {
    @GET("v1/")
    suspend fun fetchDemonSlayerCharacters(): List<DemonSlayerCharacter>

    @GET("v1/{characterName}")
    suspend fun fetchDemonSlayerCharacterDetails(@Path("characterName") characterName: String): DemonSlayerCharacter
}