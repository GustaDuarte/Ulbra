/*9 - A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco)
prestações sem juros. Faça um programa que receba um valor de uma compra
e mostre o valor das prestações.
 */
import java.util.Scanner;
public class exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Float valorCompra;
        Float valorPrestacoes;
        int div;

        System.out.println("Informe o valor da compra:");
        valorCompra = scan.nextFloat();
        System.out.println("Deseja fazer em quantas parcelas? (max. 5)");
        div = scan.nextInt();
        valorPrestacoes = valorCompra/div;

        System.out.println("O valor das prestacoes eh de: "+valorPrestacoes+"$");

    }
}
