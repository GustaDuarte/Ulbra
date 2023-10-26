/*
7 - Para elevar um número a uma potência, usamos o método _______ de Math. [Math.pow(10, 2);]
 */
import java.util.Scanner;
public class exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num;
        double elevar;
        double result;

        System.out.println("\n============================================================");
        System.out.println("Informe o numero que deseja elevar: ");
        num = scan.nextDouble();
        System.out.println("Informe a potencia que deseja elevar o numero informado: ");
        elevar = scan.nextDouble();
        //Metodo da biblioteca Math para elevar um numero a potencia desejada
        result = Math.pow(num, elevar);
        System.out.println("Resultado = "+result);
        System.out.println("============================================================");

    }
}
