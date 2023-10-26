import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float[] vetorA = new float[10];
        float[] vetorB = new float[10];
        float[] vetorC = new float[10];

        for(int i= 0; i< vetorA.length; i++){
            System.out.println("Entre com o valor do VetorA na posicao: "+i);
            vetorA[i] = scan.nextFloat();
        }
        for(int i= 0; i< vetorB.length; i++){
            System.out.println("Entre com o valor do VetorB na posicao: "+i);
            vetorB[i] = scan.nextFloat();
            vetorC[i] = vetorA[i] / vetorB[i];
        }

        System.out.println("Vetor C= ");
        for (int i = 0; i< vetorC.length; i++){
            System.out.println(vetorC[i] + " ");
        }
    }
}
