/*Escreva uma classe Estatística em	Java que faça a leitura de uma Matriz 5x5,
a classe deve ao final mostrar:
    A moda	dos	elementos no array (elemento mais freqüente).
    A mediana dos elementos no array (elemento	central).
    A média. */

import java.util.Arrays;
import java.util.Random;

public class E7 {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        // Preenche a matriz com valores aleatórios entre 1 e 10

        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = rand.nextInt(10) + 1;
            }
        }
        // Imprime a matriz
        System.out.println("Matriz:");
        for (int[] linha : matriz) { //O operador ":" é chamado de "for-each" ou "enhanced for loop" em Java. Ele é usado para iterar sobre uma coleção de elementos, como um array, sem a necessidade de usar um índice ou contador.
            System.out.println(Arrays.toString(linha)); //O método Arrays.toString() converte um array em uma String, onde os elementos do array são separados por vírgula e envolvidos por colchetes
        }

        // Calcula a moda
        int moda = calcularModa(matriz);
        System.out.println("Moda: " + moda);

        // Calcula a mediana
        int mediana = calcularMediana(matriz);
        System.out.println("Mediana: " + mediana);

        // Calcula a média
        double media = calcularMedia(matriz);
        System.out.println("Media: " + media);
    }

    // Método para calcular a moda
    private static int calcularModa(int[][] matriz) {
        int moda = -1;
        int frequenciaModa = -1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int elemento = matriz[i][j];
                int frequencia = 0;
                for (int k = 0; k < 5; k++) {
                    for (int l = 0; l < 5; l++) {
                        if (matriz[k][l] == elemento) {
                            frequencia++;
                        }
                    }
                }
                if (frequencia > frequenciaModa) {
                    moda = elemento;
                    frequenciaModa = frequencia;
                }
            }
        }
        return moda;
    }

    // Método para calcular a mediana
    private static int calcularMediana(int[][] matriz) {
        int[] array = new int[25];
        int index = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[index] = matriz[i][j];
                index++;
            }
        }
        Arrays.sort(array);
        return array[12];
    }

    // Método para calcular a média
    private static double calcularMedia(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                soma += matriz[i][j];
            }
        }
        return (double) soma / 25;
    }
}
