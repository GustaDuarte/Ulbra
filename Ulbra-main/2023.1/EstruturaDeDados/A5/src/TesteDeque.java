import java.util.Arrays;
import java.util.List;
/*Crie um deque em Java e implemente uma função que receba como entrada uma lista de números inteiros
e retorne a média móvel dos últimos K números da lista, onde K é um número inteiro fornecido como parâmetro.
A média móvel é calculada somando os últimos K números e dividindo pelo número K.*/

public class TesteDeque {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int k = 3;
        DequeMediaMovel dequeMediaMovel = new DequeMediaMovel(k);
        List<Double> mediasMoveis = dequeMediaMovel.calcularMediasMoveis(numeros, k);
        System.out.println(mediasMoveis);
    }
}
