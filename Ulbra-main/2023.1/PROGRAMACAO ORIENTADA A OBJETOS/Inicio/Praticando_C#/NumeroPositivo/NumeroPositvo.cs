/*Crie um programa que peça ao usuário para digitar um número inteiro positivo e, em seguida, imprima todos os números pares entre 1 e o número informado.*/

using System;

internal class Program
{
    private static void Main(string[] args)
    {
        int numero;
        Console.Write("Informe um numero inteiro positivo: ");
        numero = int.Parse(Console.ReadLine());

        if (numero > 0)
        {
            Console.WriteLine($"Números pares entre 1 e {numero}:");
            for (int i = 1; i <= numero; i++)
            {
                if (i % 2 == 0)
                {
                    Console.WriteLine(i);
                }
            }
        }
        else
        {
            Console.WriteLine("Número inválido. Por favor, digite um número inteiro positivo.");
        }
    }
}