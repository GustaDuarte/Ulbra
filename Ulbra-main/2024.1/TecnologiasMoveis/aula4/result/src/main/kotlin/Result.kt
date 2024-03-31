import java.lang.Exception
import java.util.Objects

sealed class Result {
    data class Success(val data: String) : Result()
    data class Error(val exception: String) : Result()
    data object Loading : Result()

    companion object {
        fun process(result: Result) {
            when (result) {
                is Success -> println("Sucesso")
                is Error -> println("Erro")
                is Loading -> println("Carregando")
            }
        }
    }
}
