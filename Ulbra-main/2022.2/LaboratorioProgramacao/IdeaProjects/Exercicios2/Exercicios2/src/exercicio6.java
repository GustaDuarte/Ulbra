/*
6 - Crie uma classe que exiba o substring de uma string FRASE composto
por todos os caracteres de FRASE exceto o último caracter.
 */
import java.util.Scanner;
public class exercicio6 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String frase;
        String subString;

        System.out.println("\n============================================================");
        System.out.println("Informe a frase:");
        frase = scan.nextLine();
        //length -1 dentro do metodo substring() vai ser o responsavel por excluir o ultimo caracter da string, o paramentro inicial 0 se refere a o primeiro caracter da string
        subString = frase.substring(0, frase.length()-1);
        System.out.println(subString);
        System.out.println("============================================================");
    }
}
