class ConverterParaMaiusculas {
    fun converterParaMaiusculas(lista: List<String>): List<String> {
        return lista.map { it.toUpperCase() }
    }
}