/*Leia um conjunto de valores inteiros e em seguida os exiba-os na ordem inversa do que foram digitados.*/

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do conjunto de valores inteiros: ");
        int tamanho = scan.nextInt();

        int[] valores = new int[tamanho];
        for (int i=0; i<valores.length; i++){
            System.out.println("Digite o "+(i+1)+"º valor: ");
            valores[i] = scan.nextInt();
        }

        System.out.println("Valores na ordem inversa que foram digtados: ");
        for (int i=valores.length-1; i>=0; i--){
            System.out.println(valores[i]);
        }
    }
}
