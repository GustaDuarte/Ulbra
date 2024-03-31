//6- Escreva uma função de extensão onde disponibiliza para todas as Strings uma função que deixa todas as letras maiúsculas.

fun String.DeixarStringMaiscula(): String {
    return this.toUpperCase()
}

fun main() {
    val texto = "testando funcao!"
    val textoMaiusculo = texto.DeixarStringMaiscula()
    println(textoMaiusculo)
}