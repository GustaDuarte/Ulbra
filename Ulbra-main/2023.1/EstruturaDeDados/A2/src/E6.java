/*Crie um vetor capaz de armazenar 50 números inteiros.
Em seguida faça o seu preenchimento automático de forma randômica. Em seguida, exiba os valores deste vetor.*/

import java.util.Scanner;
import java.util.Random;

public class E6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int[] numeros = new int[50];

        for (int i=0; i< numeros.length; i++){
            numeros[i] = rand.nextInt(50);
        }

        System.out.println("Valores: ");
        for (int i=0; i< numeros.length; i++){
            System.out.println("Posicao "+(i+1)+"- "+numeros[i]);
        }
    }
}
