/*Crie a classe Fracao, que representa uma fração matemática. Esta classe deve ser capaz de armazenar o
numerador e o denominador da fração. Ela ainda deve ter métodos que recebem uma fração como parâmetro,
multiplicam ambas as frações, e retornam uma nova fração como resultado.
Crie um programa simples que instancia duas frações, define seus valores, calcula o valor da multiplicação entre
elas e mostra o resultado.
Dica: a multiplicação de 2 frações éfeita através da multiplicação dos numeradores e dos denominadores das
frações, e o valor resultante é uma terceira fração.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Fracao f = new Fracao();

        System.out.println("Informe a primeira fracao:");
        System.out.println("Numerador: ");
        f.numerador = scan.nextInt();
        System.out.println("Denominador: ");
        f.denominador = scan.nextInt();

        System.out.println("Informe a segunda fracao: ");
        System.out.println("Numerador: ");
        f.numerador2 = scan.nextInt();
        System.out.println("Denominador: ");
        f.denominador2 = scan.nextInt();

        /* OUTRA FORMA DE MOSTRAR O RESULTADO

            int lernumerador = f.resultnumerador();
            int lerdenominador = f.resultdenominador();
         */

        f.mult();
    }
}
