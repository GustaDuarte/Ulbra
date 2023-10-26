/*4 - Construa uma classe que receba uma frase qualquer e mostre essa
frase de trás para a frente e sem espaços em branco.
 */
import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i;
        String frase;
        String novaFrase;
        StringBuilder sAux = new StringBuilder();

        System.out.println("\n============================================================");
        System.out.println("Digite a frase que deseja ordenar: ");
        frase = scan.nextLine();
        //Metodo replace substitui os caracteres de uma string;
        novaFrase = frase.replace(" ", "");
        //Variavel n recebe o numero de casas de uma string atravez do metodo length;
        n = novaFrase.length();

        //Metodo cahrAt concatena a string, em especifico dentro do laço pois é possivel especificar a posição de i
        for (i=(n-1); i>=0; i--){
            sAux.append(novaFrase.charAt(i));
        }
        System.out.println(sAux);
        System.out.println("============================================================");
    }

}


