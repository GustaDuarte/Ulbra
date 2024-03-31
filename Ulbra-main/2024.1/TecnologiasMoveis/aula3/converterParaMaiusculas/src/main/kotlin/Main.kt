// 5 - Escreva uma função que recebe uma lista de strings e retorna uma nova lista com todas as strings em maiúsculas.

fun main() {
    val converter = ConverterParaMaiusculas()
    val lista = listOf("ulbra", "em", "torres")
    val maiusculas = converter.converterParaMaiusculas(lista)
    println("Lista em maiúsculas: $maiusculas")
}