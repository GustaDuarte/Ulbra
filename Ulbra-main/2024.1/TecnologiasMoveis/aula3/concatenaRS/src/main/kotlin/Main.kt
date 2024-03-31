//7 - Escreva uma função de extensão onde disponibiliza para todas as Strings uma função que concatena o R$ aos números.

fun String.concatenarComRS(): String {
    return if (this.matches(Regex("\\d+"))) { //regex aqui é usado para verificar se contem apenas numeros
        "R$ $this"
    } else {
        this
    }
}

fun main() {
    val numero = "100"
    val numeroComRS = numero.concatenarComRS()
    println(numeroComRS) // saida sera R$ 100

    val texto = "Teste"
    val textoComRS = texto.concatenarComRS()
    println(textoComRS) // saida sera o texto original pois nao continha numeros
}