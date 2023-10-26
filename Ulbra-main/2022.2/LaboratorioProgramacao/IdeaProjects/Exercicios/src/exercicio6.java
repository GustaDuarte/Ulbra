/*6 - Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o
total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este
vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o
seu nome, o salário fixo e salário no final do mês.
 */
import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomeVendedor;
        Float salarioFixo;
        Float totalVendas;
        Float salarioFinal;
        Float comissao;

        System.out.println("Digite seu nome:");
        nomeVendedor = scan.nextLine();
        System.out.println("Informe seu salario fixo:");
        salarioFixo = scan.nextFloat();
        System.out.println("Informe o total de vendas efetuadas no mes(em dinheiro):");
        totalVendas = scan.nextFloat();
        comissao = (totalVendas*15) / 100;
        salarioFinal = salarioFixo+comissao;

        System.out.println("nome:"+nomeVendedor);
        System.out.println("Salario fixo:"+salarioFixo+"$");
        System.out.println("Salario ao final do mes:"+salarioFinal+"$");
    }
}
