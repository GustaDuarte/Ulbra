import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int manter = 0;
        int menu;
        do {
            System.out.println("_______________________________________________________");
            System.out.println("Selecione uma das opcoes:");
            System.out.println("1 - Area do Triangulo");
            System.out.println("2 - Area do Quadrado");
            System.out.println("3 - Area da Circunferencia");
            System.out.println("4 - Area do Trapezio");
            System.out.println("5 - Sair");
            System.out.println("_______________________________________________________");
            menu = scan.nextInt();


            switch (menu){
                case 1:
                    Triangulo triangulo = new Triangulo();

                    System.out.println("Informe a base do triangulo: ");
                    triangulo.base = scan.nextDouble();
                    System.out.println("Informe a altura do triangulo: ");
                    triangulo.altura = scan.nextDouble();
                    System.out.println("A area do triangulo e: " +triangulo.calcularArea());

                break;

                case 2:
                    Quadrado quadrado = new Quadrado();

                    System.out.println("Informe o lado do Quadrado: ");
                    quadrado.lado = scan.nextDouble();
                    System.out.println("A area do Quadrado e: " +quadrado.calcularArea());
                break;

                case 3:
                    Circunferencia circunferencia = new Circunferencia();

                    System.out.println("Informe o raio da Circunferencia: ");
                    circunferencia.raio = scan.nextDouble();
                    System.out.println("A area da Circunferencia e: " +circunferencia.calcularArea());
                break;

                case 4:
                    Trapezio trapezio = new Trapezio();

                    System.out.println("Informe a base maior do trapezio: ");
                    trapezio.baseMaior = scan.nextDouble();
                    System.out.println("Informe a base menor do trapezio: ");
                    trapezio.baseMenor = scan.nextDouble();
                    System.out.println("Informe a altura do trapezio: ");
                    trapezio.altura = scan.nextDouble();
                    System.out.println("A area do trapezio e: " +trapezio.calcularArea());
                break;

                case 5:
                    System.exit(0);
                break;
            }
        }while(manter == 0);
    }
}