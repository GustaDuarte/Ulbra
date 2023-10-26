import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] vetorA = new double[15];
        double[] vetorB = new double[15];

        for(int i= 0; i< vetorA.length; i++){
            System.out.println("Entre com o valor na posicao: "+i);
            vetorA[i] = scan.nextDouble();
            vetorB[i] = Math.sqrt(vetorA[i]);
        }
        System.out.println("Vetor B= ");
        for (int i = 0; i< vetorB.length; i++){
            System.out.println(vetorB[i] + " ");
        }
    }
}
