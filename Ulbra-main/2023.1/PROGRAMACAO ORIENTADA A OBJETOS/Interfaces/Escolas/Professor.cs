using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Escolas
{
    public class Professor : IPessoa
    {
        public string Nome { get; set; }
        public int Idade { get; set; }

        public Professor(string nome, int idade)
        {
            Nome = nome;
            Idade = idade;
        }

        public void Falar()
        {
            Console.WriteLine($"O professor {Nome} está falando.");
        }
    }
}