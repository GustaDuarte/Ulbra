/*1 - Crie uma classe que simule a jogada de um dado de seis lados (números
de 1 a 6) por três vezes. Ao final some seus valores e apresente o resultado
das três jogadas.
 */
public class exercicio1{
    public static void main(String[] args) {
        int valor1;
        int valor2;
        int valor3;
        int soma;

        valor1 = 1 + (int)(Math.random()*6);
        System.out.println("\n============================================================================================");
        System.out.println("Valor do dado[1] jogado: "+valor1);
        valor2 = 1 + (int)(Math.random()*6);
        System.out.println("Valor do dado[2] jogado: "+valor2);
        valor3 = 1 + (int)(Math.random()*6);
        System.out.println("Valor do dado[3] jogado: "+valor3);
        System.out.println("============================================================================================");

        System.out.println("\n============================================================================================");
        soma = valor1+valor2+valor3;
        System.out.println("Soma dos valores dos dados jogados: "+soma);
        System.out.println("============================================================================================");
    }
}
