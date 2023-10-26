import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for(int i= 0; i< vetorA.length; i++){
            System.out.println("Entre com o valor na posicao: "+i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] * i;
        }

        System.out.println("Vetor B= ");
        for (int i = 0; i< vetorB.length; i++){
            System.out.println(vetorB[i] + " ");
        }
    }
}
