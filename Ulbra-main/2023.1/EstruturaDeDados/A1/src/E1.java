/*Solicitar a idade de um número indefinido de  pessoas e imprimir a média de idade lidas.
O programa se encerra quando a média de idade for superior a 20 anos.*/
import java.util.Scanner;
import java.util.ArrayList;
public class E1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> idades = new ArrayList<>();
        double media = 0;
        int soma = 0;
        int count = 0;

        while(media <= 20) {
            System.out.println("Informe a idade:");
            int idade = scan.nextInt();
            idades.add(idade);
            soma += idade;
            count++;
            media = soma/count;
            System.out.println("Media de idade no momento: %.2f\n" +media);
        }
        System.out.println("Meida de idade superior a 20 anos!");
    }
}