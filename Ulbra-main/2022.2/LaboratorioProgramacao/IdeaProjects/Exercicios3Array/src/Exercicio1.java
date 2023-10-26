import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        for(int i= 0; i< vetorA.length; i++ ){
            System.out.println("Entre com o valor na posicao: "+i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i];
        }

        for(int i=0; i>vetorA.length; i++){
            vetorB[0] = vetorA[i];
        }

        System.out.println("Vetor A= ");
        for (int i = 0; i< vetorA.length; i++){
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Vetor B= ");
        for (int i = 0; i< vetorB.length; i++){
            System.out.println(vetorA[i] + " ");
        }
    }
}
