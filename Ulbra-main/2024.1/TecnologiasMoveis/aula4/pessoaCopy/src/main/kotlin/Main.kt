//4 - Crie uma data class pessoa que recebe no seu construtor primário nome, idade, profissão e cpf, ambos são parâmetros imutáveis. Após instanciar a classe, utilize o método copy para criar uma nova instância alterando o nome passando por parâmetro o nome completo.

fun main() {
    val pessoaOriginal = Pessoa("Gustavo Rosa", 22, "ADS", "045.912.680-63")
    println("Pessoa original: $pessoaOriginal")

    val novoNome = "Gustavo Duarte"
    val pessoaNova = pessoaOriginal.copy(nome = novoNome)

    println("Pessoa com novo nome: $pessoaNova")
}