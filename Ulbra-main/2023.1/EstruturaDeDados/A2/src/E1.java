/*Escreva uma classe que Leia 5 nomes e notas de uma turma, calcula e exibe a média das notas da turma
e em seguida exibe a relação de nomes cuja nota é superior a esta média.
Utilize vetores para armazenar as notas.*/

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] nomes = new String[5];
        double[] notas = new double[5];
        double media = 0;

        // Leitura dos nomes e notas dos alunos
         for (int i=0; i < nomes.length; i++){
             System.out.println("Informe o nome do "+(i+1)+"º aluno: ");
             nomes[i] = scan.next();
             System.out.println("Informe a nota do "+(i+1)+"º aluno: ");
             notas[i] = scan.nextDouble();
             media += notas[i];
         }

         // Calculo media
        media = (media/= nomes.length); // media /= nomes.length é equivalente a media = media / nomes.length.
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
