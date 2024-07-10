package br.com.ulbra.apicomretrofit.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.ulbra.apicomretrofit.commons.Resultado
import br.com.ulbra.apicomretrofit.data.DemonSlayerCharacter
import br.com.ulbra.apicomretrofit.data.repositories.CharactersRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharactersViewModel @Inject constructor(
    private val charactersRepository: CharactersRepository
) : ViewModel() {
    private val _demonSlayerCharacters = MutableLiveData<Resultado<List<DemonSlayerCharacter>>>()
    val demonSlayerCharacters: LiveData<Resultado<List<DemonSlayerCharacter>>> = _demonSlayerCharacters

    private val _demonSlayerCharacterDetails = MutableLiveData<Resultado<DemonSlayerCharacter>>()
    val demonSlayerCharacterDetails: LiveData<Resultado<DemonSlayerCharacter>> = _demonSlayerCharacterDetails

    fun fetchDemonSlayerCharacters() {
        viewModelScope.launch {
            _demonSlayerCharacters.value = Resultado.Loading
            try {
                val result = charactersRepository.fetchDemonSlayerCharacters()
                _demonSlayerCharacters.value = Resultado.Success(result)
            } catch (e: Exception) {
                _demonSlayerCharacters.value = Resultado.Error(e)
            }
        }
    }

    fun fetchDemonSlayerCharacterDetails(characterName: String) {
        viewModelScope.launch {
            _demonSlayerCharacterDetails.value = Resultado.Loading
            try {
                val result = charactersRepository.fetchDemonSlayerCharacterDetails(characterName)
                _demonSlayerCharacterDetails.value = Resultado.Success(result)
            } catch (e: Exception) {
                _demonSlayerCharacterDetails.value = Resultado.Error(e)
            }
        }
    }
}