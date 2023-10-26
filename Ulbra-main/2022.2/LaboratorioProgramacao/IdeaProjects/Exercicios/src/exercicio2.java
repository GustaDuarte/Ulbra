/*- Neste exercício, você deve completar 4 tarefas:
a. Imprima todos os números inteiros de 10 a 25 utilizando uma estrutura de repetição.
b. Imprima a soma dos números de 1 a 100, pulando de dois em dois (1, 3, 5, 7, etc.).
c. Começando em 0, imprima os números seguintes, enquanto a soma dos números já impressos for menor que 100.
d. Imprima a tabuada do 9 (até o décimo valor).
 */
import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {
        String op = "";
        int x = 0;
        int soma = 0;

        do {
            System.out.println("=====================================================================================================================================================================================");
            Scanner scan = new Scanner(System.in);
            System.out.print("Digite a opcao que deseja:\n");
            System.out.println("a. Imprima todos os numeros inteiros de 10 a 25 utilizando uma estrutura de repeticao.");
            System.out.println("b. Imprima a soma dos numeros de 1 a 100, pulando de dois em dois (1, 3, 5, 7, etc.).");
            System.out.println("c. Comecando em 0, imprima os numeros seguintes, enquanto a soma dos numeros ja impressos for menor que 100.");
            System.out.println("d. Imprima a tabuada do 9 (ate o decimo valor).");
            System.out.println("e. Encerrar");
            System.out.println("=====================================================================================================================================================================================");
            op = scan.nextLine();
            switch (op){
                case"a":
                    System.out.println("=====================================================================================================================================================================================");
                    for (int i=10; i<=25; i++){
                        System.out.println(i);
                    }
                    System.out.println("=====================================================================================================================================================================================");
                break;
                case"b":
                    System.out.println("=====================================================================================================================================================================================");
                    soma = 0;
                    for (int i=1; i<=100; i++){
                        i = i+1;
                        if (i == 101){
                            i = i-1;
                        }
                        soma = soma + i;
                        System.out.println(i);
                    }
                    System.out.println("A soma dos numeros eh de "+soma);
                    System.out.println("=====================================================================================================================================================================================");
                break;
                case"c":
                    System.out.println("=====================================================================================================================================================================================");
                    soma = 0;
                    int num = 0;
                    for (int i=0; soma<=100; i++){
                        soma = soma + i;
                        num = soma;
                        if (soma > 100){
                            num = soma - i;
                        }
                        System.out.println(i);
                    }
                    System.out.println("A soma dos numeros ja impressos do 0 ao 100 eh de "+num);
                    System.out.println("=====================================================================================================================================================================================");
                break;
                case"d":
                    System.out.println("=====================================================================================================================================================================================");
                    int tab9 = 0;
                    for (int i=0; i<=10; i++){
                        tab9 = 9*i;
                        System.out.println("9x"+i+"= "+tab9);
                    }
                    System.out.println("=====================================================================================================================================================================================");
                break;
                case"e":
                    x++;
                    System.out.println("=====================================================================================================================================================================================");
                    System.out.println("Voce saiu do sistema!");
                    System.out.println("=====================================================================================================================================================================================");
            }
        }while (x == 0);
    }
}