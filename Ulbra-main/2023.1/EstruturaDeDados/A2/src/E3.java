/*Leia um conjunto de alunos, cada uma com o nome e a nota.
Em seguida exiba o nome dos alunos que possuem a nota maior do que a média da turma */

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de notas: ");
        int tamanho = scan.nextInt();

        // cria um array para armazenar os nomes e notas dos alunos
        String[] nomes = new String[tamanho];
        double[] notas = new double[tamanho];
        double media = 0;

        // Leitura dos nomes e notas dos alunos
        for (int i=0; i < nomes.length; i++){
            System.out.println("Informe o nome do "+(i+1)+"º aluno: ");
            nomes[i] = scan.next();
            System.out.println("Informe a nota do "+(i+1)+"º aluno: ");
            notas[i] = scan.nextDouble();
            media += notas[i];
        }

        // Calculo da media
        media = (media/= nomes.length);
        System.out.println("Media da turma: "+media);

        // Exibição dos alunos com nota acima da média
        System.out.println("Alunos acima da media: ");
        for (int i=0; i<nomes.length; i++){
            if (notas[i] > media){
                System.out.println(nomes[i] +" - "+notas[i]);
            }
        }
    }
}
