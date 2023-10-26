public class Livro
{
    public int Id { get; set; }
    public string Nome { get; set; }
    public string Descricao { get; set; }
    public int NumPg { get; set; }
    public List<Variavel> Variaveis { get; set; }

    public Livro(int id, string nome, string descricao, List<Variavel> variaveis, int numPg)
    {
        Id = id;
        Nome = nome;
        Descricao = descricao;
        Variaveis = variaveis;
        NumPg = numPg;
    }
}