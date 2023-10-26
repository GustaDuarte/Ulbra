using LivrosSE.Model.DTO.Data.Repositories;

public class LivroRepository
{
    private List<Livro> livros = new List<Livro>();
    private RegraRepository regraRepo; // Adicione uma referência à RegraRepository

    // Construtor
    public LivroRepository(RegraRepository regraRepository, List<Variavel> variaveis)
    {
        regraRepo = regraRepository; // Atribua a instância de RegraRepository
        // Crie livros iniciais aqui
        var livrosIniciais = CriarLivrosIniciais(variaveis);
        livros.AddRange(livrosIniciais);
    }

    public Livro CriarLivro(string nome, string descricao, List<Variavel> variaveis, int numPg)
    {
        int novoId = livros.Count + 1; 
        var novoLivro = new Livro(novoId, nome, descricao, variaveis, numPg);
        livros.Add(novoLivro); // Adicione o novo livro à lista de livros
        return novoLivro; // Retorne o novo livro criado
    }

    public List<Livro> ListarLivros()
    {
        return livros;
    }

    public void ListarTodosLivros()
{
    foreach (Livro livro in livros)
    {
        Console.WriteLine($"ID: {livro.Id}, Nome: {livro.Nome}, Descrição: {livro.Descricao}");
        // Adicione qualquer outra informação que deseja mostrar
    }
}

    public List<Livro> BuscarLivroPorVariavel(List<string> variaveisDesejadas)
    {
        List<Livro> livrosFiltrados = new List<Livro>();

        foreach (var livro in livros)
        {
            // Verifique se todas as variáveis desejadas estão presentes no livro
            if (variaveisDesejadas.All(v => livro.Variaveis.Any(lv => lv.Nome == v)))
            {
                livrosFiltrados.Add(livro);
            }
        }

        return livrosFiltrados;
    }

    public Livro ObterLivroPorId(int livroId)
    {
        return livros.FirstOrDefault(l => l.Id == livroId);
    }

    public LivroRepository(List<Variavel> variaveis)
    {
        CriarLivrosIniciais(variaveis);
    }

    public List<Livro> RecomendarLivros(List<Regra> regras, List<Livro> livros, Dictionary<string, string> entradasUsuario)
    {
        List<Livro> livrosRecomendados = new List<Livro>();

        foreach (var regra in regras)
        {
            bool regraSatisfeita = true; // Assumimos que a regra é satisfeita até prova em contrário

            foreach (var criterio in regra.Criterios)
            {
                if (entradasUsuario.ContainsKey(criterio.Key) && entradasUsuario[criterio.Key] != criterio.Value)
                {
                    regraSatisfeita = false;
                    break; // Se um critério não é satisfeito, podemos sair do loop interno
                }
            }

            if (regraSatisfeita)
            {
                livrosRecomendados.Add(regra.LivroAssociado);
            }
        }

        return livrosRecomendados;
    }

    public List<Livro> CriarLivrosIniciais(List<Variavel> variaveis)
    {
        // Crie variáveis para cada livro
        var variaveisLivro1 = new List<Variavel>
        {
            variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("terror psicologico")),
            variaveis.FirstOrDefault(v => v.Nome == "local" && v.Descricao.Contains("isolado"))
        };
        // Crie o primeiro livro
        Livro livro1 = new Livro(1, "O Iluminado", "Um clássico de Stephen King sobre um hotel assombrado", variaveisLivro1, 300);

        var variaveisLivro2 = new List<Variavel>
        {
            variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("terror psicologico"))
        };
        Livro livro2 = new Livro(2, "Psicose", "Um thriller psicológico de Robert Bloch que inspirou o filme de Hitchcock.", variaveisLivro2, 320);

        var variaveisLivro3 = new List<Variavel>
        {
            variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("terror psicologico"))
        };
        Livro livro3 = new Livro(3, "A Assombração da Casa da Colina", "Um livro de Shirley Jackson sobre uma casa mal-assombrada.", variaveisLivro3, 200);

        var variaveisLivro4 = new List<Variavel>
        {
            variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("terror sobrenatural")),
            variaveis.FirstOrDefault(v => v.Nome == "local" && v.Descricao.Contains("cidade pequena"))
        };
        Livro livro4 = new Livro(4, "It: A Coisa", "Outro sucesso de Stephen King sobre um palhaço assustador.", variaveisLivro4, 500);

        var variaveisLivro5 = new List<Variavel>
        {
            variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("possessao demoniaca"))
        };
        Livro livro5 = new Livro(5, "O Exorcista", "Um livro de William Peter Blatty sobre uma possessão demoníaca.", variaveisLivro5, 360);

        var variaveisLivro6 = new List<Variavel>
        {
            variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("terror sobrenatural")),
            variaveis.FirstOrDefault(v => v.Nome == "local" && v.Descricao.Contains("Cemiterio"))
        };
        Livro livro6 = new Livro(6, "O Cemitério", "Uma obra de Stephen King sobre um cemitério misterioso.", variaveisLivro6, 420);

        var variaveisLivro7 = new List<Variavel>
        {
            variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("fantasia sombria")),
            variaveis.FirstOrDefault(v => v.Nome == "local" && v.Descricao.Contains("outro mundo"))
        };
        Livro livro7 = new Livro(7, "Coraline", "Um livro de Neil Gaiman sobre uma porta secreta e um mundo sombrio.", variaveisLivro7, 200);

        var variaveisLivro8 = new List<Variavel>
        {
            variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("realismo magico"))
        };
        Livro livro8 = new Livro(8, "A Casa dos Espíritos", "Um romance de Isabel Allende com elementos sobrenaturais.", variaveisLivro8, 400);

        var variaveisLivro9 = new List<Variavel>
        {
            variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("slasher")),
            variaveis.FirstOrDefault(v => v.Nome == "local" && v.Descricao.Contains("casa isolada"))
        };
        Livro livro9 = new Livro(9, "Os Estranhos", "Um livro de Bryan Bertino que inspirou o filme homônimo.", variaveisLivro9, 280);

        var variaveisLivro10 = new List<Variavel>
        {
            variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("telecinese")),
            variaveis.FirstOrDefault(v => v.Nome == "local" && v.Descricao.Contains("cidade pequena"))
        };
        Livro livro10 = new Livro(10, "Carrie, a Estranha", "O primeiro romance de Stephen King sobre uma adolescente com poderes telecinéticos.", variaveisLivro10, 320);

        var variaveisLivro11 = new List<Variavel>
        {
            variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("casa mal assombrada")),
            variaveis.FirstOrDefault(v => v.Nome == "local" && v.Descricao.Contains("casa assombrada"))
        };
        Livro livro11 = new Livro(11, "Horror em Amityville", "Um livro de Jay Anson sobre uma casa amaldiçoada.", variaveisLivro11, 250);

        var variaveisLivro12 = new List<Variavel>
        {
            variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("serial killer"))
        };
        Livro livro12 = new Livro(12, "O Silêncio dos Inocentes", "Um thriller psicológico de Thomas Harris com o famoso personagem Hannibal Lecter.", variaveisLivro12, 350);

        var variaveisLivro13 = new List<Variavel>
        {
            variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("fa obsessiva"))
        };
        Livro livro13 = new Livro(13, "Misery", "Outro livro de Stephen King sobre um escritor capturado por uma fã obsessiva.", variaveisLivro13, 270);

        var variaveisLivro14 = new List<Variavel>
        {
            variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("zumbis"))
        };
        Livro livro14 = new Livro(14, "A Noite dos Mortos-Vivos", "Um livro de John Russo que inspirou o filme de George A. Romero.", variaveisLivro14, 280);

        var variaveisLivro15 = new List<Variavel>
        {
            variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("horror cosmico"))
        };
        Livro livro15 = new Livro(15, "O Chamado de Cthulhu", "Um conto de H.P. Lovecraft sobre uma entidade cósmica aterrorizante.", variaveisLivro15, 280);

        var variaveisLivro16 = new List<Variavel>
        {
            variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("vampiros")),
            variaveis.FirstOrDefault(v => v.Nome == "local" && v.Descricao.Contains("pequena cidade"))
        };
        Livro livro16 = new Livro(16, "A Hora do Vampiro", "Um romance de Stephen King sobre vampiros em uma pequena cidade.", variaveisLivro16, 400);

        var variaveisLivro17 = new List<Variavel>
        {
            variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("culto pagao")),
            variaveis.FirstOrDefault(v => v.Nome == "local" && v.Descricao.Contains("ilha remota"))
        };
        Livro livro17 = new Livro(17, "O Homem de Palha", "Um livro de Robin Hardy que inspirou o filme de mesmo nome.", variaveisLivro17, 290);

        var variaveisLivro18 = new List<Variavel>
        {
            variaveis.FirstOrDefault(v => v.Nome == "genero" && v.Descricao.Contains("necronomicon"))
        };
        Livro livro18 = new Livro(18, "Livro dos Mortos", "Um texto egípcio antigo que desencadeia eventos sobrenaturais em 'Evil Dead'.", variaveisLivro18, 180);

        return new List<Livro>
        {
            livro1, livro2, livro3, livro4, livro5, livro6, livro7, livro8, livro9, livro10,
            livro11, livro12, livro13, livro14, livro15, livro16, livro17, livro18
        };
    }
}
