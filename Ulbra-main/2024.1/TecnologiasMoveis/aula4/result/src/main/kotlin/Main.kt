//3 - Crie uma sealed class que tenha o nome result e algumas classes que herdam da mesma, como Sucesso, Error e Loading.

fun main() {
    val result: Result = Result.Success("sucesso")
    val load: Result = Result.Loading
    val errorResult: Result = Result.Error("erro")

    Result.process(result)
    Result.process(load)
    Result.process(errorResult)
}