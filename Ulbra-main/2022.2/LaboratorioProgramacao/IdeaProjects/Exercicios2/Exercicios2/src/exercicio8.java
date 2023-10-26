/*
8 - Para converter radianos em graus, usamos o método _______ de Math. [Math.toDegrees(variavel);]
 */
import java.util.Scanner;
public class exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radiano;
        double grau;

        System.out.println("\n============================================================");
        System.out.println("Informe o numero em radiano: ");
        radiano = scan.nextDouble();
        grau = Math.toDegrees(radiano);
        System.out.println("Resultado em graus = "+grau);
        System.out.println("============================================================");

    }
}
