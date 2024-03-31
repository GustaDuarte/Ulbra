//2 - Crie uma classe pessoa que tenha um construtor primário que recebe nome e idade como parâmetro, além disso, é necessário ter um método caminhar e falar. Obs: Os métodos caminhar e falar devem apenas printar "caminhando" e "falando"

fun main() {
    val pessoa = Pessoa("Gustavo", 22)
    println("Nome: ${pessoa.nome}, Idade: ${pessoa.idade}")

    pessoa.caminhar()
    pessoa.falar()
}