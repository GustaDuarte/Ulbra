// 3 - Escreva uma função que remove números inteiros duplicados.

fun main() {
    val removeDuplicatas = RemoveDuplicatas()
    val lista = listOf(1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 10)
    val semDuplicatas = removeDuplicatas.removerDuplicatas(lista)
    println("Lista sem duplicatas: $semDuplicatas")
}