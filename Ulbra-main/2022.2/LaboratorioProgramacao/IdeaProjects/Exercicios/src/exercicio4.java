/*4 - Escrever um programa java que receba dois números e exiba o resultado da sua soma.
 */
import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        int n1;
        int n2;
        int soma;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor de n1:\n");
        n1 = scan.nextInt();
        System.out.print("Digite o valor de n2:\n");
        n2 = scan.nextInt();
        soma = n1+n2;
        System.out.println("A soma de n1+n2 = "+soma);
    }
}
