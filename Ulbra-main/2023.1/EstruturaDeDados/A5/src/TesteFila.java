import java.util.ArrayList;
import java.util.List;
/*Crie uma fila em Java e implemente uma função que receba como entrada uma lista de números inteiros e
retorne uma nova lista com os mesmos números, mas em ordem crescente. Utilize o algoritmo de ordenação bubble sort.*/

public class TesteFila {
    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.enfileirar(3);
        fila.enfileirar(2);
        fila.enfileirar(1);

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(5);
        numeros.add(3);
        numeros.add(9);
        numeros.add(1);
        numeros.add(7);
        List<Integer> numerosOrdenados = fila.ordenarBubbleSort(numeros);

        for (int i = 0; i < numerosOrdenados.size(); i++) {
            System.out.print(numerosOrdenados.get(i) + " ");
        }
    }
}