    using System;
    using System.Collections.Generic;
    using LivrosSE.Model.DTO.Data.Repositories;


class Program
    {
        private static List<Variavel> variaveis = new List<Variavel>();
        static void Main(string[] args)
        {
            
            var variavelRepo = new VariavelRepository();
            var livroRepo = new LivroRepository(variaveis);
            var regraRepo = new RegraRepository(livroRepo); // Agora o RegraRepository aceita o LivroRepository como dependênciav

            // Suponha que você já tenha instâncias de RecomendadorLivro.

            // Suponha que você também tenha uma lista de livros chamada "livros".
            List<Livro> livros = new List<Livro>();
            List<Regra> regras = new List<Regra>();

            // Variáveis iniciais para os livros
            var descricaoVariavelGenero = new List<string> { "terror psicológico", "terror sobrenatural", "possessão demoníaca", "fantasia sombria", "realismo mágico", "slasher", "telecinese", "casa mal assombrada", "serial killer", "fã obsessiva", "zumbis", "horror cósmico", "vampiros", "culto pagão", "necronomicon" };
            Variavel variavelGenero = new Variavel("genero", descricaoVariavelGenero);
            variavelRepo.AdicionarVariavel(variavelGenero.Nome, string.Join(",", variavelGenero.Descricao));

            var descricaoVariavelLocal = new List<string> { "ilha remota", "pequena cidade", "casa assombrada", "casa isolada", "outro mundo", "cemitério", "isolado", "floresta" };
            Variavel variavelLocal = new Variavel("local", descricaoVariavelLocal);
            variavelRepo.AdicionarVariavel(variavelLocal.Nome, string.Join(",", variavelLocal.Descricao));

            var variaveisLivro1 = new List<Variavel>
            {
                variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("terror psicologico")),
                variaveis.FirstOrDefault(v => v.Nome == "local" && v.Descricao.Contains("isolado"))
            };
            // Crie o primeiro livro
            Livro livro1 = livroRepo.CriarLivro("O Iluminado", "Um clássico de Stephen King sobre um hotel assombrado", variaveisLivro1, 300);
            var livroRefereancia = livroRepo.ListarLivros().FirstOrDefault(l => l.Nome == "O Iluminado");
            if (livro1 != null)
            {
                var criterios1 = new Dictionary<string, string>
                {
                    { "genero", "terror psicologico" },
                    { "local", "isolado" }
                };
                var regra1 = regraRepo.CriarRegra("Regra 1", "Esta regra corresponde a O Iluminado", criterios1, livro1);
                regras.Add(regra1);
            }
            Livro livro2 = livroRepo.CriarLivro("Psicose", "Um thriller psicológico de Robert Bloch que inspirou o filme de Hitchcock.", variaveisLivro1, 300);
            livroRefereancia = livroRepo.ListarLivros().FirstOrDefault(l => l.Nome == "Psicose");
            if (livro2 != null)
            {
                var criterios2 = new Dictionary<string, string>
                {
                    { "genero", "terror psicologico" }
                };
                var regra2 = regraRepo.CriarRegra("Regra 2", "Esta regra corresponde a Psicose", criterios2, livro2);
                regras.Add(regra2);
            }
            var variaveisLivro3 = new List<Variavel>
            {
                variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("terror psicologico"))
            };
            Livro livro3 = livroRepo.CriarLivro("A Assombração da Casa da Colina", "Um livro de Shirley Jackson sobre uma casa mal-assombrada.", variaveisLivro3, 200);
            var livroReferencia3 = livroRepo.ListarLivros().FirstOrDefault(l => l.Nome == "A Assombração da Casa da Colina");
            if (livroReferencia3 != null)
            {
                var criterios3 = new Dictionary<string, string>
                {
                    { "genero", "terror psicologico" }
                };
                var regra3 = regraRepo.CriarRegra("Regra 3", "Esta regra corresponde a A Assombração da Casa da Colina", criterios3, livroReferencia3);
                regras.Add(regra3);
            }

            var variaveisLivro4 = new List<Variavel>
            {
                variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("terror sobrenatural")),
                variaveis.FirstOrDefault(v => v.Nome == "local" && v.Descricao.Contains("cidade pequena"))
            };
            Livro livro4 = livroRepo.CriarLivro("It: A Coisa", "Outro sucesso de Stephen King sobre um palhaço assustador.", variaveisLivro4, 500);
            var livroReferencia4 = livroRepo.ListarLivros().FirstOrDefault(l => l.Nome == "It: A Coisa");
            if (livroReferencia4 != null)
            {
                var criterios4 = new Dictionary<string, string>
                {
                    { "genero", "terror sobrenatural" },
                    { "local", "cidade pequena" }
                };
                var regra4 = regraRepo.CriarRegra("Regra 4", "Esta regra corresponde a It: A Coisa", criterios4, livroReferencia4);
                regras.Add(regra4);
            }

            var variaveisLivro5 = new List<Variavel>
            {
                variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("possessao demoniaca"))
            };
            Livro livro5 = livroRepo.CriarLivro("O Exorcista", "Um livro de William Peter Blatty sobre uma possessão demoníaca.", variaveisLivro5, 360);
            var livroReferencia5 = livroRepo.ListarLivros().FirstOrDefault(l => l.Nome == "O Exorcista");
            if (livroReferencia5 != null)
            {
                var criterios5 = new Dictionary<string, string>
                {
                    { "genero", "possessao demoniaca" }
                };
                var regra5 = regraRepo.CriarRegra("Regra 5", "Esta regra corresponde a O Exorcista", criterios5, livroReferencia5);
                regras.Add(regra5);
            }
            var variaveisLivro6 = new List<Variavel>
            {
                variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("terror sobrenatural")),
                variaveis.FirstOrDefault(v => v.Nome == "local" && v.Descricao.Contains("Cemiterio"))
            };
            Livro livro6 = livroRepo.CriarLivro("O Cemitério", "Uma obra de Stephen King sobre um cemitério misterioso.", variaveisLivro6, 420);
            var livroReferencia6 = livroRepo.ListarLivros().FirstOrDefault(l => l.Nome == "O Cemitério");
            if (livroReferencia6 != null)
            {
                var criterios6 = new Dictionary<string, string>
                {
                    { "genero", "terror sobrenatural" },
                    { "local", "Cemiterio" }
                };
                var regra6 = regraRepo.CriarRegra("Regra 6", "Esta regra corresponde a O Cemitério", criterios6, livroReferencia6);
                regras.Add(regra6);
            }

            var variaveisLivro7 = new List<Variavel>
            {
                variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("fantasia sombria")),
                variaveis.FirstOrDefault(v => v.Nome == "local" && v.Descricao.Contains("outro mundo"))
            };
            Livro livro7 = livroRepo.CriarLivro("Coraline", "Um livro de Neil Gaiman sobre uma porta secreta e um mundo sombrio.", variaveisLivro7, 200);
            var livroReferencia7 = livroRepo.ListarLivros().FirstOrDefault(l => l.Nome == "Coraline");
            if (livroReferencia7 != null)
            {
                var criterios7 = new Dictionary<string, string>
                {
                    { "genero", "fantasia sombria" },
                    { "local", "outro mundo" }
                };
                var regra7 = regraRepo.CriarRegra("Regra 7", "Esta regra corresponde a Coraline", criterios7, livroReferencia7);
                regras.Add(regra7);
            }

            var variaveisLivro8 = new List<Variavel>
            {
                variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("realismo magico"))
            };
            Livro livro8 = livroRepo.CriarLivro("A Casa dos Espíritos", "Um romance de Isabel Allende com elementos sobrenaturais.", variaveisLivro8, 400);
            var livroReferencia8 = livroRepo.ListarLivros().FirstOrDefault(l => l.Nome == "A Casa dos Espíritos");
            if (livroReferencia8 != null)
            {
                var criterios8 = new Dictionary<string, string>
                {
                    { "genero", "realismo magico" }
                };
                var regra8 = regraRepo.CriarRegra("Regra 8", "Esta regra corresponde a A Casa dos Espíritos", criterios8, livroReferencia8);
                regras.Add(regra8);
            }

            var variaveisLivro9 = new List<Variavel>
            {
                variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("slasher")),
                variaveis.FirstOrDefault(v => v.Nome == "local" && v.Descricao.Contains("casa isolada"))
            };
            Livro livro9 = livroRepo.CriarLivro("Os Estranhos", "Um livro de Bryan Bertino que inspirou o filme homônimo.", variaveisLivro9, 280);
            var livroReferencia9 = livroRepo.ListarLivros().FirstOrDefault(l => l.Nome == "Os Estranhos");
            if (livroReferencia9 != null)
            {
                var criterios9 = new Dictionary<string, string>
                {
                    { "genero", "slasher" },
                    { "local", "casa isolada" }
                };
                var regra9 = regraRepo.CriarRegra("Regra 9", "Esta regra corresponde a Os Estranhos", criterios9, livroReferencia9);
                regras.Add(regra9);
            }

            var variaveisLivro10 = new List<Variavel>
            {
                variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("telecinese")),
                variaveis.FirstOrDefault(v => v.Nome == "local" && v.Descricao.Contains("cidade pequena"))
            };
            Livro livro10 = livroRepo.CriarLivro("Carrie, a Estranha", "O primeiro romance de Stephen King sobre uma adolescente com poderes telecinéticos.", variaveisLivro10, 320);
            var livroReferencia10 = livroRepo.ListarLivros().FirstOrDefault(l => l.Nome == "Carrie, a Estranha");
            if (livroReferencia10 != null)
            {
                var criterios10 = new Dictionary<string, string>
                {
                    { "genero", "telecinese" },
                    { "local", "cidade pequena" }
                };
                var regra10 = regraRepo.CriarRegra("Regra 10", "Esta regra corresponde a Carrie, a Estranha", criterios10, livroReferencia10);
                regras.Add(regra10);
            }
            var variaveisLivro11 = new List<Variavel>
            {
                variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("casa mal assombrada")),
                variaveis.FirstOrDefault(v => v.Nome == "local" && v.Descricao.Contains("casa assombrada"))
            };
            Livro livro11 = livroRepo.CriarLivro("Horror em Amityville", "Um livro de Jay Anson sobre uma casa amaldiçoada.", variaveisLivro11, 250);
            var livroReferencia11 = livroRepo.ListarLivros().FirstOrDefault(l => l.Nome == "Horror em Amityville");
            if (livroReferencia11 != null)
            {
                var criterios11 = new Dictionary<string, string>
                {
                    { "genero", "casa mal assombrada" },
                    { "local", "casa assombrada" }
                };
                var regra11 = regraRepo.CriarRegra("Regra 11", "Esta regra corresponde a Horror em Amityville", criterios11, livroReferencia11);
                regras.Add(regra11);
            }
            var variaveisLivro12 = new List<Variavel>
            {
                variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("serial killer"))
            };
            Livro livro12 = livroRepo.CriarLivro("O Silêncio dos Inocentes", "Um thriller psicológico de Thomas Harris com o famoso personagem Hannibal Lecter.", variaveisLivro12, 350);
            var livroReferencia12 = livroRepo.ListarLivros().FirstOrDefault(l => l.Nome == "O Silêncio dos Inocentes");
            if (livroReferencia12 != null)
            {
                var criterios12 = new Dictionary<string, string>
                {
                    { "genero", "serial killer" }
                };
                var regra12 = regraRepo.CriarRegra("Regra 12", "Esta regra corresponde a O Silêncio dos Inocentes", criterios12, livroReferencia12);
                regras.Add(regra12);
            }

            var variaveisLivro13 = new List<Variavel>
            {
                variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("fa obsessiva"))
            };
            Livro livro13 = livroRepo.CriarLivro("Misery", "Outro livro de Stephen King sobre um escritor capturado por uma fã obsessiva.", variaveisLivro13, 270);
            var livroReferencia13 = livroRepo.ListarLivros().FirstOrDefault(l => l.Nome == "Misery");
            if (livroReferencia13 != null)
            {
                var criterios13 = new Dictionary<string, string>
                {
                    { "genero", "fa obsessiva" }
                };
                var regra13 = regraRepo.CriarRegra("Regra 13", "Esta regra corresponde a Misery", criterios13, livroReferencia13);
                regras.Add(regra13);
            }

            var variaveisLivro14 = new List<Variavel>
            {
                variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("zumbis"))
            };
            Livro livro14 = livroRepo.CriarLivro("A Noite dos Mortos-Vivos", "Um livro de John Russo que inspirou o filme de George A. Romero.", variaveisLivro14, 280);
            var livroReferencia14 = livroRepo.ListarLivros().FirstOrDefault(l => l.Nome == "A Noite dos Mortos-Vivos");
            if (livroReferencia14 != null)
            {
                var criterios14 = new Dictionary<string, string>
                {
                    { "genero", "zumbis" }
                };
                var regra14 = regraRepo.CriarRegra("Regra 14", "Esta regra corresponde a A Noite dos Mortos-Vivos", criterios14, livroReferencia14);
                regras.Add(regra14);
            }

            var variaveisLivro15 = new List<Variavel>
            {
                variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("horror cosmico"))
            };
            Livro livro15 = livroRepo.CriarLivro("O Chamado de Cthulhu", "Um conto de H.P. Lovecraft sobre uma entidade cósmica aterrorizante.", variaveisLivro15, 280);
            var livroReferencia15 = livroRepo.ListarLivros().FirstOrDefault(l => l.Nome == "O Chamado de Cthulhu");
            if (livroReferencia15 != null)
            {
                var criterios15 = new Dictionary<string, string>
                {
                    { "genero", "horror cosmico" }
                };
                var regra15 = regraRepo.CriarRegra("Regra 15", "Esta regra corresponde a O Chamado de Cthulhu", criterios15, livroReferencia15);
                regras.Add(regra15);
            }

            var variaveisLivro16 = new List<Variavel>
            {
                variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("vampiros")),
                variaveis.FirstOrDefault(v => v.Nome == "local" && v.Descricao.Contains("pequena cidade"))
            };
            Livro livro16 = livroRepo.CriarLivro("A Hora do Vampiro", "Um romance de Stephen King sobre vampiros em uma pequena cidade.", variaveisLivro16, 400);
            var livroReferencia16 = livroRepo.ListarLivros().FirstOrDefault(l => l.Nome == "A Hora do Vampiro");
            if (livroReferencia16 != null)
            {
                var criterios16 = new Dictionary<string, string>
                {
                    { "genero", "vampiros" },
                    { "local", "pequena cidade" }
                };
                var regra16 = regraRepo.CriarRegra("Regra 16", "Esta regra corresponde a A Hora do Vampiro", criterios16, livroReferencia16);
                regras.Add(regra16);
            }

            var variaveisLivro17 = new List<Variavel>
            {
                variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("culto pagao")),
                variaveis.FirstOrDefault(v => v.Nome == "local" && v.Descricao.Contains("ilha remota"))
            };
            Livro livro17 = livroRepo.CriarLivro("O Homem de Palha", "Um livro de Robin Hardy que inspirou o filme de mesmo nome.", variaveisLivro17, 290);
            var livroReferencia17 = livroRepo.ListarLivros().FirstOrDefault(l => l.Nome == "O Homem de Palha");
            if (livroReferencia17 != null)
            {
                var criterios17 = new Dictionary<string, string>
                {
                    { "genero", "culto pagao" },
                    { "local", "ilha remota" }
                };
                var regra17 = regraRepo.CriarRegra("Regra 17", "Esta regra corresponde a O Homem de Palha", criterios17, livroReferencia17);
                regras.Add(regra17);
            }

            var variaveisLivro18 = new List<Variavel>
            {
                variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("necronomicon"))
            };
            Livro livro18 = livroRepo.CriarLivro("Livro dos Mortos", "Um texto egípcio antigo que desencadeia eventos sobrenaturais em 'Evil Dead'.", variaveisLivro18, 180);
            var livroReferencia18 = livroRepo.ListarLivros().FirstOrDefault(l => l.Nome == "Livro dos Mortos");
            if (livroReferencia18 != null)
            {
                var criterios18 = new Dictionary<string, string>
                {
                    { "genero", "necronomicon" }
                };
                var regra18 = regraRepo.CriarRegra("Regra 18", "Esta regra corresponde a Livro dos Mortos", criterios18, livroReferencia18);
                regras.Add(regra18);
            }

            while (true) // Loop infinito até o usuário escolher sair
            {
                Console.WriteLine("Escolha uma das opções abaixo:");
                Console.WriteLine("1 - Criar Variável");
                Console.WriteLine("2 - Criar Livro");
                Console.WriteLine("3 - Criar Regra");
                Console.WriteLine("4 - Listar Variáveis");
                Console.WriteLine("5 - Listar Livros");
                Console.WriteLine("6 - Listar Regras");
                Console.WriteLine("7 - Recomendar Livro");
                Console.WriteLine("8 - Editar Variável");
                Console.WriteLine("9 - Editar Regra");
                Console.WriteLine("0 - Sair");

                string escolha = Console.ReadLine();

                switch (escolha)
                {
                    case "1":
                        Console.WriteLine("Digite o nome da variável:");
                        string nomeVar = Console.ReadLine();
                        Console.WriteLine("Digite os valores da variável separados por vírgula:");
                        string valorVar = Console.ReadLine();
                        variavelRepo.AdicionarVariavel(nomeVar, valorVar);
                    break;
                    case "2":
                        Console.WriteLine("Digite o nome do livro:");
                        string nomeLivro = Console.ReadLine();
                        
                        Console.WriteLine("Digite a descrição do livro:");
                        string descricaoLivro = Console.ReadLine();

                        // Listar variáveis disponíveis para o livro
                        Console.WriteLine("Variáveis disponíveis:");
                        variavelRepo.ListarVariaveis();

                        Console.WriteLine("Digite os números das variáveis que se aplicam ao livro (separados por vírgula):");
                        string inputVariaveis = Console.ReadLine();
                        List<Variavel> variaveisLivro = new List<Variavel>();

                        if (!string.IsNullOrEmpty(inputVariaveis))
                        {
                            string[] numerosVariaveis = inputVariaveis.Split(',');
                            foreach (string numero in numerosVariaveis)
                            {
                                if (int.TryParse(numero, out int varIndex) && varIndex >= 0 && varIndex < variaveis.Count)
                                {
                                    variaveisLivro.Add(variaveis[varIndex]);
                                }
                            }
                        }

                        Console.WriteLine("Digite o número de páginas do livro:");
                        if (int.TryParse(Console.ReadLine(), out int numPaginas))
                        {
                            Livro novoLivro = livroRepo.CriarLivro(nomeLivro, descricaoLivro, variaveisLivro, numPaginas);
                            Console.WriteLine($"Livro '{novoLivro.Nome}' criado com sucesso!");
                        }
                        else
                        {
                            Console.WriteLine("Número de páginas inválido. O livro não foi criado.");
                        }
                    break;
                    case "3":
                        Console.WriteLine("Digite a expressão da regra:");
                        string expressaoRegra = Console.ReadLine();

                        Console.WriteLine("Digite a descrição da regra:");
                        string descricaoRegra = Console.ReadLine();

                        Console.WriteLine("Digite os critérios da regra (ex: genero=terror,local=cidade pequena):");
                        string criteriosInput = Console.ReadLine();
                        var criterios = new Dictionary<string, string>();

                        if (!string.IsNullOrEmpty(criteriosInput))
                        {
                            string[] criteriosArray = criteriosInput.Split(',');
                            foreach (string criterio in criteriosArray)
                            {
                                string[] partesCriterio = criterio.Split('=');
                                if (partesCriterio.Length == 2)
                                {
                                    criterios[partesCriterio[0]] = partesCriterio[1];
                                }
                            }
                        }

                        Console.WriteLine("Selecione o livro associado à regra (digite o ID do livro):");
                        int livroId;
                        if (int.TryParse(Console.ReadLine(), out livroId))
                        {
                            Livro livroAssociado = livroRepo.ObterLivroPorId(livroId);
                            if (livroAssociado != null)
                            {
                                Regra novaRegra = regraRepo.CriarRegra(expressaoRegra, descricaoRegra, criterios, livroAssociado);
                                Console.WriteLine($"Regra '{novaRegra.Descricao}' criada com sucesso e associada ao livro '{livroAssociado.Nome}'.");
                            }
                            else
                            {
                                Console.WriteLine("Livro não encontrado. A regra não foi criada.");
                            }
                        }
                        else
                        {
                            Console.WriteLine("ID do livro inválido. A regra não foi criada.");
                        }
                    break;
                    case "4":
                        // Lista as variáveis armazenadas
                        variavelRepo.ListarVariaveis();
                    break;
                    case "5":
                    livroRepo.ListarTodosLivros();
                    break;
                
                    case "6":
                        regraRepo.ListarRegras();
                        break;
                    case "7":
                        Console.WriteLine("Digite o critério de gênero (ou deixe em branco):");
                        string genero = Console.ReadLine();
                        Console.WriteLine("Digite o critério de local (ou deixe em branco):");
                        string local = Console.ReadLine();

                        var entradasUsuario = new Dictionary<string, string>();
                        if (!string.IsNullOrWhiteSpace(genero))
                        {
                            entradasUsuario["genero"] = genero;
                        }
                        if (!string.IsNullOrWhiteSpace(local))
                        {
                            entradasUsuario["local"] = local;
                        }

                        var livrosRecomendados = livroRepo.RecomendarLivros(regras, livros, entradasUsuario);


                        if (livrosRecomendados.Count > 0)
                        {
                            Console.WriteLine("Livros recomendados:");
                            foreach (var livro in livrosRecomendados)
                            {
                                Console.WriteLine($"Título: {livro.Nome}, Descrição: {livro.Descricao}");
                            }
                        }
                        else
                        {
                            Console.WriteLine("Nenhum livro recomendado com base nos critérios informados.");
                        }
                    break;
                    case "8":
                    variavelRepo.EditarVariavel();
                    break;
                    case "9":
                    Console.WriteLine("Digite a descrição da regra a ser editada:");
                    string descricaoEditRegra = Console.ReadLine();
                    regraRepo.EditarRegra(descricaoEditRegra);
                    break;
                    case "0":
                        return;
                    default:
                        Console.WriteLine("Opção inválida. Escolha uma das opções listadas.");
                    break;
                }
            }
        }
    }
