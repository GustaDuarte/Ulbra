public class Variavel
{
    public string Nome { get; set; }
    public List<string> Descricao { get; set; }

    public Variavel(string nome, List<string> descricao)
    {
        Nome = nome;
        Descricao = descricao;
    }

    public void AdicionarDescricao(string novaDescricao)
    {
        Descricao.Add(novaDescricao);
    }
}