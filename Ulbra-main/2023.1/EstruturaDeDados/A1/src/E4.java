/*Escrever um programa que receba vários números inteiros no teclado e no final imprimir a média dos números múltiplos de 3.
Para sair digitar 0(zero).*/
import java.util.Scanner;
public class E4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, soma = 0, count = 0;
        do {
            System.out.print("Digite um número (ou 0 para sair): ");
            num = scan.nextInt();

            if (num != 0 && num % 3 == 0) {
                soma += num;
                count++;
            }
        } while (num != 0);

        double media = soma/count;

        System.out.println("Média dos números múltiplos de 3: " +media);
    }
}
