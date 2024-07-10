package br.com.ulbra.exemplorecycler.commons

sealed class Resultado<out T> {
    object Loading : Resultado<Nothing>()
    data class Success<out T>(val data: T) : Resultado<T>()
    data class Error(val exception: Exception) : Resultado<Nothing>()
}

