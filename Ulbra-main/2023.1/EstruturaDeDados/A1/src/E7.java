/*Crie uma classe que armazena os 12 meses do ano em um array.
A seguir, gere um valor randômico entre 0 e 11 e apresente o mês correspondente ao valor sorteado.
Considere que o valor 0 corresponde ao mês de janeiro e o valor 11, ao mês de dezembro.*/
import java.util.Random;
public class E7 {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        System.out.println("Gerando valor aleatorio, sendo 0 para Janeiro... 11 para Dezembro:");
        int mesRandom = rand.nextInt(12);
        System.out.println("O mes sorteado foi: "+mes[mesRandom]);

    }
}
