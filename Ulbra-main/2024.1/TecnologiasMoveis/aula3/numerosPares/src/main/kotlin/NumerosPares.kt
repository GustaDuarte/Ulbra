class NumerosPares {
    fun filtrarPares(lista: List<Int>) : List<Int> {
        return lista.filter { it % 2 == 0 }
    }
}