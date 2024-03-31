// 2 - Escreva uma função que recebe uma lista de números e retorna apenas os números pares.

fun main() {
    val numerosPares = NumerosPares()
    val lista = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val pares = numerosPares.filtrarPares(lista)
    println("Numeros pares: $pares")
}