public class Circunferencia {
    double raio;
    double area;

    public double calcularArea(){
        area = Math.PI * Math.pow(raio, 2);
        return area;
    }
}
