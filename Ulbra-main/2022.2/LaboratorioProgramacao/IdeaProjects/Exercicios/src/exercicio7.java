/*7 - Escrever um programa que leia o nome de um aluno e as notas das três
provas que ele obteve no semestre. No final informar o nome do aluno e a
sua média (aritmética).
 */
import java.util.Scanner;
public class exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        Float n1;
        Float n2;
        Float n3;
        Float media;
        System.out.println("Informe seu nome:");
        nome = scan.nextLine();
        System.out.println("Digite a nota das provas em sequencia:");
        n1 = scan.nextFloat();
        n2 = scan.nextFloat();
        n3 = scan.nextFloat();
        media = (n1+n2+n3)/3;
        System.out.println("Nome do aluno: "+nome);
        System.out.println("Media obtida: "+media);
    }
}
