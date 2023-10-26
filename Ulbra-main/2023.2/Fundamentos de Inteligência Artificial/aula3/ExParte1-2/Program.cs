using System;

namespace ExParte1_2
{
    class Program
    {
        static void Main(string[] args)
        {
            double entrada1, entrada2, entrada3;
            double peso1, peso2, peso3;

            Console.Write("Digite o valor da primeira entrada: ");
            entrada1 = Convert.ToDouble(Console.ReadLine());

            Console.Write("Digite o valor da segunda entrada: ");
            entrada2 = Convert.ToDouble(Console.ReadLine());

            Console.Write("Digite o valor da terceira entrada: ");
            entrada3 = Convert.ToDouble(Console.ReadLine());

            Console.Write("Digite o valor do peso da primeira entrada: ");
            peso1 = Convert.ToDouble(Console.ReadLine());

            Console.Write("Digite o valor do peso da segunda entrada: ");
            peso2 = Convert.ToDouble(Console.ReadLine());

            Console.Write("Digite o valor do peso da terceira entrada: ");
            peso3 = Convert.ToDouble(Console.ReadLine());

            double resultado = (entrada1 * peso1) + (entrada2 * peso2) + (entrada3 * peso3);

            Console.WriteLine($"Resultado: {resultado}");
        }
    }
}

