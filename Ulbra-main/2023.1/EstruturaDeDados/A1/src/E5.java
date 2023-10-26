/*Escreva um programa que crie um array de inteiros data e use um laço for para criar um novo String que exiba o
conteúdo do array data entre chaves e separado por vírgulas.
Por exemplo, se o array data tiver tamanho 4 e armazenar os valores 3, 4, 1, 5, o String “{3, 4, 1, 5}” deve ser criado e exibido.*/
import java.util.Scanner;
public class E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] data = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Informe o valor do elemento %d: ", i+1); //add um valor para cada posição do vetor.
            data[i] = scanner.nextInt();
        }

        String arrayString = "{";
        for (int i = 0; i < data.length; i++) {
            arrayString += data[i];
            if (i < data.length - 1) {
                arrayString += ", "; //le a arrayString usando a função .length e organiza com a ','.
            }
        }
        arrayString += "}"; //fecha a arrayString.
        System.out.println("O array informado foi: " + arrayString);
    }
}
