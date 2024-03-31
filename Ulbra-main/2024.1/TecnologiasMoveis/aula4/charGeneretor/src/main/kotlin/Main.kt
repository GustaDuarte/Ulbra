// 1 -Crie uma classe "CharGenerator" que receba no seu construtor primário (primary constructor), um valor min e um max e tenha um método onde gere um novo caracter.

fun main() {
    val charGenerator = CharGenerator('A', 'Z')
    val generatedChar = charGenerator.generateChar()
    println("New Character: $generatedChar")
}