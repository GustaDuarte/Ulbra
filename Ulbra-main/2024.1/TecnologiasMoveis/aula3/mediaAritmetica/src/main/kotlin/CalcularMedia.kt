class CalculadoraMedia {
    fun calcularMedia(lista: List<Double>): Double {
        if (lista.isEmpty()) return 0.0
        val soma = lista.sum()
        return soma / lista.size
    }
}