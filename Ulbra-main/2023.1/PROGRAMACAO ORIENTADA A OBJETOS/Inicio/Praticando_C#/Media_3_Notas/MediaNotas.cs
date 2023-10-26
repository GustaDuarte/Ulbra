/*Crie um programa que calcule a média de três notas informadas pelo usuário. Em seguida, imprima na tela a média calculada.*/
using System;

internal class MediaNotas
{
    private static void Main(string[] args)
    {
        double nota1, nota2, nota3, media;
        Console.Write("Informe a primeira nota: ");
        nota1 = double.Parse(Console.ReadLine());

        Console.Write("Informe a segunda nota: ");
        nota2 = double.Parse(Console.ReadLine());

        Console.Write("Informe a terceira nota: ");
        nota3 = double.Parse(Console.ReadLine());
        media = (nota1 + nota2 + nota3) / 3;

        Console.WriteLine($"A média das três notas é {media:F1}.");
    }
}