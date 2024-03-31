// 4 - Escreva uma função que encontra o último elemento ímpar em uma lista de inteiros.

fun main() {
    val ultimoImpar = UltimoImpar()
    val lista = listOf(2, 4, 6, 7, 8, 9, 10, 11)
    val ultimo = ultimoImpar.encontrarUltimoImpar(lista)
    if (ultimo != null) {
        println("Último elemento ímpar: $ultimo")
    } else {
        println("Não há números ímpares na lista.")
    }
}