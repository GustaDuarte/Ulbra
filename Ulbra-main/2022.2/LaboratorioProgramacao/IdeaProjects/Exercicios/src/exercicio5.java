/*5 - Escrever um programa em java para calcular o consumo médio de um automóvel sendo
fornecida a distância total percorrida pelo automóvel e o total de combustível gasto.
 */
import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Float consumoMedio;
        Float km;
        Float combustivel;

        System.out.println("Informe a distancia percorrida:");
        km = scan.nextFloat();
        System.out.println("Informe o combustivel gasto:");
        combustivel = scan.nextFloat();
        consumoMedio= km/combustivel;
        System.out.println("O consumo medio do automovel eh de: "+consumoMedio+" km/l");
    }
}
