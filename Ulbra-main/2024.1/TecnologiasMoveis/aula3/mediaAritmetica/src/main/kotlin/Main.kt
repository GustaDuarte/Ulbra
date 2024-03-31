// 1 - Escreva uma função que recebe uma lista de números e retorna a média aritmética.

fun main() {
    val calculadora = CalculadoraMedia()
    val numeros = listOf(2.0, 4.0, 6.0, 8.0, 10.0)
    val media = calculadora.calcularMedia(numeros)
    println("A média é: $media")
}