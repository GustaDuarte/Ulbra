package br.com.ulbra.apicomretrofit.data.repositories

import br.com.ulbra.apicomretrofit.data.DemonSlayerCharacter
import br.com.ulbra.apicomretrofit.data.datasources.CharactersDataSource
import javax.inject.Inject

class CharactersRepository @Inject constructor(
    private val charactersDataSource: CharactersDataSource
) {
    suspend fun fetchDemonSlayerCharacters(): List<DemonSlayerCharacter> {
        return charactersDataSource.fetchDemonSlayerCharacters()
    }

    suspend fun fetchDemonSlayerCharacterDetails(characterName: String): DemonSlayerCharacter {
        return charactersDataSource.fetchDemonSlayerCharacterDetails(characterName)
    }
}