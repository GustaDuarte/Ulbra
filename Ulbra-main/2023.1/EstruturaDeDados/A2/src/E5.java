/* Crie um vetor capaz de armazenar 50 números inteiros.
Em seguida faça o seu preenchimento automático com os números de 101 a 150, ou seja, na posição número 0 ponha 101,
na posição 1 ponha o número 102, e assim sucessivamente. Em seguida, exiba os valores deste vetor.*/

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[50];
        int x = 101;

        for (int i=0; i< numeros.length; i++){
            numeros[i] = x;
            x++;
        }

        System.out.println("Valores: ");
        for (int i=0; i< numeros.length; i++){
            System.out.println("Posicao "+(i+1)+"- "+numeros[i]);
        }
    }
}
