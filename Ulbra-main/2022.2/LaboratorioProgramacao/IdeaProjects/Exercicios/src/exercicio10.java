/*10 - Faça um programa que receba o preço de custo de um produto e mostre o
valor de venda. Sabe-se que o preço de custo receberá um acréscimo de
acordo com um percentual informado pelo usuário.
 */
import java.util.Scanner;
public class exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Float precoProduto;
        Float valorVenda;
        Float acrescimoUsuario;
        int percentual;

        System.out.println("Informe o preco de custo do produto:");
        precoProduto = scan.nextFloat();
        System.out.println("Informe o percentual em cima do valor deste produto:");
        percentual = scan.nextInt();
        acrescimoUsuario = (precoProduto*percentual)/100;
        valorVenda = precoProduto + acrescimoUsuario;
        System.out.println("Valor de venda do produto: "+valorVenda+"$");

    }

}
