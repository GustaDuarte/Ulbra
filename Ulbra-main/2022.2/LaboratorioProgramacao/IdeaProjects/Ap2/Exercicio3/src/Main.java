public class Main {
    public static void main(String[] args) {
        Quadrado q = new Quadrado(4);
        System.out.println("Area do Quadrado = "+q.calcularArea());

        Circunferencia c = new Circunferencia(2);
        System.out.println("Area da Circunferencia = "+c.calcularArea());

        Retangulo r = new Retangulo(2, 4);
        System.out.println("Area do Retangulo = "+r.calcularArea());
    }
}