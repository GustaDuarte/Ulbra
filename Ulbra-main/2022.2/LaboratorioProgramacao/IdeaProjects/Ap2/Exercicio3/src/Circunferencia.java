public class Circunferencia implements AreaCalculavel {
    private double raio;
    public Circunferencia(double raio){
        this.raio = raio;
    }
    @Override
    public double calcularArea() {
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }
}