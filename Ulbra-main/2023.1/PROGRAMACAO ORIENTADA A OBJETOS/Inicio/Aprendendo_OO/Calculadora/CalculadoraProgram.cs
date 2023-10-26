/*Crie uma classe chamada "Calculadora" que tenha dois métodos: "Somar" e "Subtrair". 
O método "Somar" deve receber dois números como parâmetros e retornar a soma desses números. 
O método "Subtrair" deve receber dois números como parâmetros e retornar a subtração desses números. 
Crie um objeto dessa classe e utilize os métodos para realizar operações matemáticas.*/
using System;

namespace Aprendendo_OO
{
    class CalculadoraProgram
    {
        static void Main(string[] args)
        {
            Calculadora minhaCalculadora = new Calculadora();

            int x = 0;
            int num = 0;

            do {
                Console.WriteLine("Menu Calculadora:");
                Console.WriteLine("1- Somar");
                Console.WriteLine("2- Subtrair");
                Console.WriteLine("0- Sair\n");

                num = int.Parse(Console.ReadLine());

                switch (num) {
                    case 1:
                        Console.WriteLine("Informe o primeiro número:");
                        int num1 = int.Parse(Console.ReadLine());

                        Console.WriteLine("Informe o segundo número:");
                        int num2 = int.Parse(Console.ReadLine());

                        int resultadoSoma = minhaCalculadora.Somar(num1, num2);
                        Console.WriteLine("Resultado: " + resultadoSoma + "\n");
                        break;

                    case 2:
                        Console.WriteLine("Informe o primeiro número:");
                        num1 = int.Parse(Console.ReadLine());

                        Console.WriteLine("Informe o segundo número:");
                        num2 = int.Parse(Console.ReadLine());

                        int resultadoSubtracao = minhaCalculadora.Subtrair(num1, num2);
                        Console.WriteLine("Resultado: " + resultadoSubtracao + "\n");
                        break;

                    case 0:
                        x = 1;
                        break;

                    default:
                        Console.WriteLine("Opção inválida.\n");
                        break;
                }

            } while (x == 0);
        }
    }
}
