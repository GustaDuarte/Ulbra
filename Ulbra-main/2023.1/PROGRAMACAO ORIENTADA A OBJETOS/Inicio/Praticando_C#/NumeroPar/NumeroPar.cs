/*Crie um programa que peça ao usuário para digitar um número inteiro e verifique se o número é par ou ímpar. 
Em seguida, imprima na tela uma mensagem informando o resultado.*/

using System;

internal class NumeroPar
{
    private static void Main(string[] args)
    {
        Console.Write("Digite um numero inteiro: ");
        int num = int.Parse(Console.ReadLine());

        if (num % 2 == 0)
        {
            Console.WriteLine($"O número {num} é par.");
        }
        else
        {
            Console.WriteLine($"O número {num} é ímpar.");
        }
    }
}