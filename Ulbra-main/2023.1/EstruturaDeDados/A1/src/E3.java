/*Escrever um programa que leia, valores inteiros, até ser lido o valor-99.
Quando isso acontecer, o programa deverá escrever a soma e a média dos valores lidos.
 */
import java.util.Scanner;
public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor, media;
        int soma = 0, count = 0;

        do {
            System.out.println("Informe um valor inteiro (-99 para sair):");
            valor = scanner.nextInt();

            if (valor != -99){
                soma += valor;
                count++;
            }
        } while(valor != -99);
        media = soma/count;

        System.out.println("Soma dos valores lidos: \n"+soma);
        System.out.println("Media dos valores lidos:"+media);
    }
}
