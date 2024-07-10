package br.com.ulbra.apicomretrofit.data.datasources

import br.com.ulbra.apicomretrofit.data.network.CharactersApi
import br.com.ulbra.apicomretrofit.data.network.responses.CharactersResponse
import br.com.ulbra.apicomretrofit.data.network.responses.ResultsResponse
import javax.inject.Inject

class CharactersDataSource @Inject constructor(
    private val api: CharactersApi
) {
    suspend fun fetchCharacters(): List<CharactersResponse> {
        return api.fetchCharacters()
    }
}