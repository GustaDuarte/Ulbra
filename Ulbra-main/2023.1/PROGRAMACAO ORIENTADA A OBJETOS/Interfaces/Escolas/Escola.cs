using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Escolas
{
    public class Escola
    {
        public void ApresentarPessoa(IPessoa pessoa)
        {
            Console.WriteLine($"Nome: {pessoa.Nome}");
            Console.WriteLine($"Idade: {pessoa.Idade}");
            pessoa.Falar();
        }
    }
}