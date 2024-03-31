class UltimoImpar {
    fun encontrarUltimoImpar(lista: List<Int>): Int? {
        for (i in lista.size - 1 downTo 0) if (lista[i] % 2 != 0) return lista[i]
        return null // retorna null se nao tiver numero impar
    }
}