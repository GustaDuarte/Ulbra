package br.com.ulbra.apicomretrofit.data.datasources

import br.com.ulbra.apicomretrofit.data.DemonSlayerCharacter
import br.com.ulbra.apicomretrofit.data.network.CharactersApi
import br.com.ulbra.apicomretrofit.data.network.responses.ResultsResponse
import javax.inject.Inject

class CharactersDataSource @Inject constructor(
    private val api: CharactersApi
) {
    suspend fun fetchDemonSlayerCharacters(): List<DemonSlayerCharacter> {
        return api.fetchDemonSlayerCharacters()
    }

    suspend fun fetchDemonSlayerCharacterDetails(characterName: String): DemonSlayerCharacter {
        return api.fetchDemonSlayerCharacterDetails(characterName)
    }
}
