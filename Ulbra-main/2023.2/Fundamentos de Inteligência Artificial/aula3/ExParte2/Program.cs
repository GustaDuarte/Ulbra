using System;

namespace ExParte2
{    
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Digite o número de entradas: ");
            int numEntradas = Convert.ToInt32(Console.ReadLine());

            double[] entradas = new double[numEntradas];
            double[] pesos = new double[numEntradas];

            // Ler valores das entradas
            for (int i = 0; i < numEntradas; i++)
            {
                Console.Write($"Digite o valor da entrada {i + 1}: ");
                entradas[i] = Convert.ToDouble(Console.ReadLine());

                Console.Write($"Digite o peso para a entrada {i + 1}: ");
                pesos[i] = Convert.ToDouble(Console.ReadLine());
            }

            double resultado = 0;

            // Calcular somatório ponderado
            for (int i = 0; i < numEntradas; i++)
            {
                resultado += entradas[i] * pesos[i];
                Console.Write($"Resultado: {resultado}:");
            }

            Console.WriteLine($"Resultado final: {resultado}");
        }
    }
}

