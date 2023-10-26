import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for(int i= 0; i< vetorA.length; i++){
            System.out.println("Entre com o valor do VetorA na posicao: "+i);
            vetorA[i] = scan.nextInt();
        }
        for(int i= 0; i< vetorB.length; i++){
            System.out.println("Entre com o valor do VetorB na posicao: "+i);
            vetorB[i] = scan.nextInt();
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("Vetor C= ");
        for (int i = 0; i< vetorC.length; i++){
            System.out.println(vetorC[i] + " ");
        }
    }
}
