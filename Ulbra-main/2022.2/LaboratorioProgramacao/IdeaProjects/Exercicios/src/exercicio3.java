
/*- 3 - Imprima os 15 primeiros números da série de Fibonacci. A série de Fibonacci é tem os
seguintes elementos: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc. Para calculá-la, o primeiro e segundo
elementos valem 1, e daí por diante, o n-ésimo elemento vale o (n-1)-ésimo elemento
somado ao (n-2)-ésimo elemento (ex: 8 = 5 + 3).
Para mais informações, consulte:
http://pt.wikipedia.org/wiki/Número_de_Fibonacci.
 */
import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        int cont = 0;
        int limite;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o limite que deseja:\n");
        limite = scan.nextInt();
        while (cont<limite){
            n3 = n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
            cont=cont+1;
        }
    }
}
