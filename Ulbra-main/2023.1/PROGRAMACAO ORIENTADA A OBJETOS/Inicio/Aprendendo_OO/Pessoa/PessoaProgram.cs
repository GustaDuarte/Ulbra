/*Crie uma classe chamada "Pessoa" que tenha dois atributos: "Nome" e "Idade". 
Crie um método chamado "Apresentar" que imprima na tela o nome e a idade da pessoa. 
Crie um objeto dessa classe e chame o método "Apresentar".*/
using System;

namespace Aprendendo_OO
{
    class PessoaProgram
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Nome:");
            string nome = Console.ReadLine();

            Console.WriteLine("Idade:");
            int idade = int.Parse(Console.ReadLine());

            Pessoa novaPessoa = new Pessoa(nome, idade);
            novaPessoa.Apresentar();
        }
    }
}
           