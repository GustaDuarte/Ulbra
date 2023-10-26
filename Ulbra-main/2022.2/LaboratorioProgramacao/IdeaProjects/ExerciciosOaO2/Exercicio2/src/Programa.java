import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Turma aluno = new Turma();
        Aluno prova = new Aluno();
        Prova nota = new Prova();

        System.out.println("_________________________________________________________________________________________");
        System.out.println("ALUNO-1 ");
        nota.notaTotal=nota.calcularNotaTotal(4.0,2.5);
        prova.prova1 = nota.notaTotal;
        System.out.println("prova 1: "+nota.notaTotal);

        System.out.println("\n");

        nota.notaTotal=nota.calcularNotaTotal(1.0,7.0);
        prova.prova2 = nota.notaTotal;
        System.out.println("prova 2: "+nota.notaTotal);
        System.out.println();

        System.out.println("Media: "+prova.calcularMedia(prova.prova1, prova.prova2));
        System.out.println("_________________________________________________________________________________________");
        System.out.println("\n");
        aluno.aluno1 = prova.media;


        System.out.println("_________________________________________________________________________________________");
        System.out.println("ALUNO-2 ");
        nota.notaTotal=nota.calcularNotaTotal(6.5,3.5);
        System.out.println("Nota1: "+nota.notaParte1);
        System.out.println("Nota2: "+nota.notaParte2);
        prova.prova1 = nota.notaTotal;
        System.out.println("prova 1: "+nota.notaTotal);
        System.out.println("\n");
        nota.notaTotal=nota.calcularNotaTotal(0.0,3.0);
        System.out.println("Nota1: "+nota.notaParte1);
        System.out.println("Nota2: "+nota.notaParte2);
        prova.prova2 = nota.notaTotal;
        System.out.println("prova 2: "+nota.notaTotal);
        System.out.println();
        System.out.println("Media: "+prova.calcularMedia(prova.prova1, prova.prova2));
        System.out.println("_________________________________________________________________________________________");
        System.out.println("\n");
        aluno.aluno2 = prova.media;


        System.out.println("_________________________________________________________________________________________");
        System.out.println("ALUNO-3 ");
        nota.notaTotal=nota.calcularNotaTotal(5.0,4.0);
        System.out.println("Nota1: "+nota.notaParte1);
        System.out.println("Nota2: "+nota.notaParte2);
        prova.prova1 = nota.notaTotal;
        System.out.println("prova 1: "+nota.notaTotal);
        System.out.println("\n");
        nota.notaTotal=nota.calcularNotaTotal(6.0,1.5);
        System.out.println("Nota1: "+nota.notaParte1);
        System.out.println("Nota2: "+nota.notaParte2);
        prova.prova2 = nota.notaTotal;
        System.out.println("prova 2: "+nota.notaTotal);
        System.out.println();
        System.out.println("Media: "+prova.calcularMedia(prova.prova1, prova.prova2));
        System.out.println("_________________________________________________________________________________________");
        aluno.aluno3 = prova.media;
        System.out.println();


        System.out.println("_________________________________________________________________________________________");
        System.out.println("MEDIA DA TURMA: "+aluno.calcularMedia());
        System.out.println("_________________________________________________________________________________________");

    }
}
