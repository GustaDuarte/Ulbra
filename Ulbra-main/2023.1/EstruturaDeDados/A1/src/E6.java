/*Elabore uma classe que receba 5 notas de alunos por meio, armazene essas notas em um array de cinco elementos,
apresente em tela as cinco notas em ordem decrescente (da maior para a menor) e a média aritmética das notas.*/
import java.util.Arrays;
import java.util.Scanner;
public class E6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // criando o array de notas com 5 elementos
        double[] notas = new double[5];

        // lendo as notas
        for (int i = 0; i < notas.length; i++){
            System.out.println("Digite a " + (i+1) +" nota:");
            notas[i] = scan.nextDouble();
        }

        // ordenando o array em ordem decrescente
        Arrays.sort(notas);
        for (int i = 0; i < notas.length / 2; i++){
            double x = notas[i];
            notas[i] = notas[notas.length - 1 - i];
            notas[notas.length - 1 - i] = x;
        }

        // ordenando o array em ordem decrescente (outra forma)
        /*
        for (int i = notas.length - 1; i>= 0; i--){
            for (int x = notas.length - 1; x > i; x--){
                if (notas[x] > notas[i]) {
                    double y = notas[i];
                    notas[i] = notas[x];
                    notas[x] = y;
                }
            }
        }
        System.out.println(Arrays.toString(notas));
        */

        // imprimindo as notas em ordem decrescente
        System.out.println("Notas em ordem decrescente: ");
        for (double nota : notas){
            System.out.println(nota);
        }

        // calculando e imprimindo a média aritmética
        double soma = 0;
        for (double nota : notas){
            soma += nota;
        }
        double media = soma / notas.length;
        System.out.println("Media aritmetica: "+media);
    }
}
