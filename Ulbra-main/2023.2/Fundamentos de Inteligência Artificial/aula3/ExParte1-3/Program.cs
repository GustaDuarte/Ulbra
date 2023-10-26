using System;

namespace ExParte1_3
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Digite o valor de entrada para o primeiro neurônio: ");
            double entradaNeuronio1 = Convert.ToDouble(Console.ReadLine());

            Console.Write("Digite o peso para o primeiro neurônio: ");
            double pesoNeuronio1 = Convert.ToDouble(Console.ReadLine());

            Neuronio neuronio1 = new Neuronio(pesoNeuronio1);

            double saidaNeuronio1 = neuronio1.CalcularSaida(entradaNeuronio1);

            Console.WriteLine($"Resultado do primeiro neurônio: {saidaNeuronio1}");

            Console.Write("Digite o peso para o segundo neurônio: ");
            double pesoNeuronio2 = Convert.ToDouble(Console.ReadLine());

            Neuronio neuronio2 = new Neuronio(pesoNeuronio2);

            double saidaNeuronio2 = neuronio2.CalcularSaida(saidaNeuronio1);

            Console.WriteLine("Saída do segundo neurônio: " + saidaNeuronio2);
        }
    }
}

