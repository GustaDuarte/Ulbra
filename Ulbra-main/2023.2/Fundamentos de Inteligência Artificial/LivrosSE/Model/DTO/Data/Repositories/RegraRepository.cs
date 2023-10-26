using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace LivrosSE.Model.DTO.Data.Repositories
{
    public class RegraRepository
    {
        private List<Regra> regras = new List<Regra>();
        private bool regrasListadas = false;
        private LivroRepository livroRepo;

        // Construtor personalizado que aceita LivroRepository como dependência
        public RegraRepository(LivroRepository livroRepository)
        {
            livroRepo = livroRepository;
            var regrasIniciais = CriarRegrasIniciais();
            regras.AddRange(regrasIniciais);
        }

        public Regra CriarRegra(string expressao, string descricao, Dictionary<string, string> criterios, Livro livroAssociado)
        {
            int novoId = regras.Count + 1;
            var novaRegra = new Regra(novoId, expressao, descricao, criterios, livroAssociado);
            regras.Add(novaRegra);
            return novaRegra;
        }

        public void ListarRegras()
        {
            if (!regrasListadas)
            {
                foreach (var regra in regras)
                {
                    Console.WriteLine($"ID: {regra.Id}, Descrição: {regra.Descricao}");
                    // Aqui você pode adicionar outros detalhes das regras, se necessário
                }

                // Defina a variável de controle como true para indicar que as regras já foram listadas.
                regrasListadas = true;
            }
        }

        public Regra BuscarRegra(string descricao)
        {
            return regras.FirstOrDefault(r => r.Descricao == descricao);
        }

        public List<Regra> GetRegras()
        {
            return regras;
        }

        public void EditarRegra(string descricao)
        {
            var regraParaEditar = BuscarRegra(descricao);

            if (regraParaEditar != null)
            {
                Console.WriteLine($"Editando a regra com a descrição: {regraParaEditar.Descricao}");

                Console.WriteLine("Digite a nova expressão da regra:");
                string novaExpressao = Console.ReadLine();

                Console.WriteLine("Digite a nova descrição da regra:");
                string novaDescricao = Console.ReadLine();

                Console.WriteLine("Digite os novos critérios da regra (formato: chave1=valor1,chave2=valor2):");
                string novosCriterios = Console.ReadLine();

                // Analisar os novos critérios em um Dictionary
                var criterios = novosCriterios.Split(',')
                    .Select(part => part.Split('='))
                    .ToDictionary(split => split[0], split => split[1]);

                regraParaEditar.Expressao = novaExpressao;
                regraParaEditar.Descricao = novaDescricao;
                regraParaEditar.Criterios = criterios;

                Console.WriteLine("Regra editada com sucesso!");
            }
            else
            {
                Console.WriteLine("Regra não encontrada.");
            }
        }

        public List<Regra> CriarRegrasIniciais()
        {   

            var regrasIniciais = new List<Regra>();
            // Regra 1
            var livro1 = livroRepo.ListarLivros().FirstOrDefault(l => l.Nome == "O Iluminado");
            if (livro1 != null)
            {
                var criterios1 = new Dictionary<string, string>
                {
                    { "genero", "terror psicologico" },
                    { "local", "isolado" }
                };
                var regra1 = CriarRegra("Regra 1", "Esta regra corresponde a O Iluminado", criterios1, livro1);
                regrasIniciais.Add(regra1);
            }
            
            // Regra 2
            // var criterios2 = new Dictionary<string, string>
            // {
            //     { "genero", "terror psicologico" }
            // };
            // var regra2 = CriarRegra("Regra 2", "Esta regra corresponde a Psicose", criterios2);

            // Regra 3
            // var criterios3 = new Dictionary<string, string>
            // {
            //     { "genero", "terror psicologico" }
            // };
            // var regra3 = CriarRegra("Regra 3", "Esta regra corresponde a A Assombração da Casa da Colina", criterios3);

            // Regra 4
            // var criterios4 = new Dictionary<string, string>
            // {
            //     { "genero", "terror sobrenatural" },
            //     { "local", "cidade pequena" }
            // };
            // var regra4 = CriarRegra("Regra 4", "Esta regra corresponde a It: A Coisa", criterios4);

            // Regra 5
            // var criterios5 = new Dictionary<string, string>
            // {
            //     { "genero", "possessao demoniaca" }
            // };
            // var regra5 = CriarRegra("Regra 5", "Esta regra corresponde a O Exorcista", criterios5);

            // Regra 6
            // var criterios6 = new Dictionary<string, string>
            // {
            //     { "genero", "terror sobrenatural" },
            //     { "local", "Cemiterio" }
            // };
            // var regra6 = CriarRegra("Regra 6", "Esta regra corresponde a O Cemitério", criterios6);

            // Regra 7
            // var criterios7 = new Dictionary<string, string>
            // {
            //     { "genero", "fantasia sombria" },
            //     { "local", "outro mundo" }
            // };
            // var regra7 = CriarRegra("Regra 7", "Esta regra corresponde a Coraline", criterios7);

            // Regra 8
            // var criterios8 = new Dictionary<string, string>
            // {
            //     { "genero", "realismo magico" }
            // };
            // var regra8 = CriarRegra("Regra 8", "Esta regra corresponde a A Casa dos Espíritos", criterios8);

            // Regra 9
            // var criterios9 = new Dictionary<string, string>
            // {
            //     { "genero", "slasher" },
            //     { "local", "casa isolada" }
            // };
            // var regra9 = CriarRegra("Regra 9", "Esta regra corresponde a Os Estranhos", criterios9);

            // Regra 10
            // var criterios10 = new Dictionary<string, string>
            // {
            //     { "genero", "telecinese" },
            //     { "local", "cidade pequena" }
            // };
            // var regra10 = CriarRegra("Regra 10", "Esta regra corresponde a Carrie, a Estranha", criterios10);

            // Regra 11
            // var criterios11 = new Dictionary<string, string>
            // {
            //     { "genero", "casa mal assombrada" },
            //     { "local", "casa assombrada" }
            // };
            // var regra11 = CriarRegra("Regra 11", "Esta regra corresponde a Horror em Amityville", criterios11);

            // Regra 12
            // var criterios12 = new Dictionary<string, string>
            // {
            //     { "genero", "serial killer" }
            // };
            // var regra12 = CriarRegra("Regra 12", "Esta regra corresponde a O Silêncio dos Inocentes", criterios12);

            // Regra 13
            // var criterios13 = new Dictionary<string, string>
            // {
            //     { "genero", "fa obsessiva" }
            // };
            // var regra13 = CriarRegra("Regra 13", "Esta regra corresponde a Misery", criterios13);

            // Regra 14
            // var criterios14 = new Dictionary<string, string>
            // {
            //     { "genero", "zumbis" }
            // };
            // var regra14 = CriarRegra("Regra 14", "Esta regra corresponde a A Noite dos Mortos-Vivos", criterios14);

            // Regra 15
            // var criterios15 = new Dictionary<string, string>
            // {
            //     { "genero", "horror cosmico" }
            // };
            // var regra15 = CriarRegra("Regra 15", "Esta regra corresponde a O Chamado de Cthulhu", criterios15);

            // Regra 16
            // var criterios16 = new Dictionary<string, string>
            // {
            //     { "genero", "vampiros" },
            //     { "local", "pequena cidade" }
            // };
            // var regra16 = CriarRegra("Regra 16", "Esta regra corresponde a A Hora do Vampiro", criterios16);

            // Regra 17
            // var criterios17 = new Dictionary<string, string>
            // {
            //     { "genero", "culto pagao" },
            //     { "local", "ilha remota" }
            // };
            // var regra17 = CriarRegra("Regra 17", "Esta regra corresponde a O Homem de Palha", criterios17);

            // Regra 18
            // var criterios18 = new Dictionary<string, string>
            // {
            //     { "genero", "necronomicon" }
            // };
            // var regra18 = CriarRegra("Regra 18", "Esta regra corresponde a Livro dos Mortos", criterios18);

            return regrasIniciais;
        } 
    }
}
