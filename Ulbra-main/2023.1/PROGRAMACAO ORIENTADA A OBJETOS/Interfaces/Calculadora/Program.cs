using Calculadora;

/*Crie uma interface ICalculadora com os métodos Somar(), Subtrair(), Multiplicar() e Dividir(). 
Em seguida, crie uma classe Calculadora que implementa a interface ICalculadora com sua própria implementação dos métodos. Em um programa, instancie a classe Calculadora e use cada um dos métodos para realizar operações matemáticas.*/
class Program {
    static void Main(string[] args) {
        Calculadora calculadora = new Calculadora();
        double a = 10;
        double b = 5;
        Console.WriteLine($"Soma de {a} e {b} = {calculadora.Somar(a, b)}");
        Console.WriteLine($"Subtração de {a} e {b} = {calculadora.Subtrair(a, b)}");
        Console.WriteLine($"Multiplicação de {a} e {b} = {calculadora.Multiplicar(a, b)}");
        Console.WriteLine($"Divisão de {a} e {b} = {calculadora.Dividir(a, b)}");
    }
}