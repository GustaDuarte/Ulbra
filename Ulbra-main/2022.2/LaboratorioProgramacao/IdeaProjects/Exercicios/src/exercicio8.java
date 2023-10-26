/*Escrever uma programa em que leia dois valores para as variáveis A e B, e
efetuar as trocas dos valores de forma que a variável A passe a possuir o valor
da variável B e a variável B passe a possuir o valor da variável A. Apresentar
os valores trocados.
Lembrando que temos que ter 3 variáveis para que uma haja como variável
de armazenamento, ou seja, para evitar que o valor original de a se perca é
necessário associar a uma outra variável (denominada usualmente de
variável auxiliar) tal valor, estabelecer uma associação de a com o valor em b
e, por último, associar b ao valor "salvo" na variável auxiliar.
 */
import java.util.Scanner;
public class exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A;
        int B;
        int aux;

        System.out.println("Informe o valor de A");
        A = scan.nextInt();
        System.out.println("Informe o valor de B");
        B = scan.nextInt();

        aux = A;
        A = B;
        B = aux;

        System.out.println("O valor de A eh: "+A);
        System.out.println("O valor de B eh: "+B);
    }
}
