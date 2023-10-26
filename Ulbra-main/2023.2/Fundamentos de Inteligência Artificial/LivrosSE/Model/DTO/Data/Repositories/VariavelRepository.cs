using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace LivrosSE.Model.DTO.Data.Repositories
{
    public class VariavelRepository
    {
        private List<Variavel> variaveis;

        public VariavelRepository()
        {
            variaveis = new List<Variavel>();
        }

        public void AdicionarVariavel(string nomeVariavel, string valores)
        {
            var novaVariavel = new Variavel(nomeVariavel, valores.Split(',').ToList());
            variaveis.Add(novaVariavel);

            Console.WriteLine("Variável criada com sucesso!");
        }
        public void ListarVariaveis()
        {
            Console.WriteLine("Variáveis existentes:");
            foreach (var variavel in variaveis)
            {
                Console.WriteLine($"Nome: {variavel.Nome}, Valores: {string.Join(", ", variavel.Descricao)}");
            }
        }

        public void EditarVariavel()
        {
            Console.WriteLine("Selecione a variável a ser editada (pelo nome):");
            string nomeVariavel = Console.ReadLine();

            var variavelParaEditar = variaveis.FirstOrDefault(v => v.Nome == nomeVariavel);

            if (variavelParaEditar != null)
            {
                Console.WriteLine("Digite os novos valores da variável separados por vírgula:");
                string novosValores = Console.ReadLine();

                variavelParaEditar.Descricao = novosValores.Split(',').ToList();
                Console.WriteLine("Variável editada com sucesso!");
            }
            else
            {
                Console.WriteLine("Variável não encontrada.");
            }
        }
    }
}