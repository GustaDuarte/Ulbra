public class Trapezio {
    double baseMaior;
    double baseMenor;
    double altura;
    double area;

    public double calcularArea(){
        area = ((baseMaior + baseMenor)/2)*altura;
        return area;
    }
}
