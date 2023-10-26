public class Quadrado {
    double lado;
    double area;

    public double calcularArea() {
        area = Math.pow(lado, 2);
        return area;
    }
}
