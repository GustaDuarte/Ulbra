class CharGenerator(private val min: Char, private val max: Char) {

    init {
        require(min <= max) { "O valor mínimo deve ser menor que o valor máximo." }
    }

    fun generateChar(): Char {
        return (min.toInt()..max.toInt()).random().toChar()
    }
}