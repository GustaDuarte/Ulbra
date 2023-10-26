/*
5 - Elabore uma classe que receba uma frase e verique que se essa frase
possui palavras impróprias. As palavras impróprias são: sexo e sexual. Caso
encontre uma dessas palavras, emita em tela a mensagem “conteúdo
impróprio”, caso contrário “conteúdo liberado”,
 */
import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String frase;
        String lerFrase;

        System.out.println("\n============================================================");
        System.out.println("Digite a frase que deseja verificar o conteudo: ");
        frase = scan.nextLine();
        //Variavel auxiliar para caso o texto seja upCase ele force o texto a LowerCase, assi diminuindo os if´s necessarios
        lerFrase = frase.toLowerCase();

        if (lerFrase.contains("sexo")){
            System.out.println("Conteudo improprio!");
        }else if (lerFrase.contains("sexual")){
            System.out.println("Conteudo improprio!");
        }else{
            System.out.println("Conteudo liberado!");
        }
        System.out.println("============================================================");
    }
}
