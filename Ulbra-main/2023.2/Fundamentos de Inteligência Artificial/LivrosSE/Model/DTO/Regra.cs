public class Regra
{
    public int Id { get; set; }
    public string Expressao { get; set; }
    public string Descricao { get; set; }
    public Dictionary<string, string> Criterios { get; set; } // Adicionamos os critérios
    public Livro LivroAssociado { get; set; }

    public Regra(int id, string expressao, string descricao, Dictionary<string, string> criterios, Livro livro)
    {
        Id = id;
        Expressao = expressao;
        Descricao = descricao;
        Criterios = criterios;
        LivroAssociado = livro;
    }

    public bool AvaliarCritérios()
    {
        if (LivroAssociado == null)
        {
            return false; // Não é possível avaliar os critérios sem um livro associado
        }

        var livro = LivroAssociado;

        foreach (var criterio in Criterios)
        {
            var variavel = livro.Variaveis.FirstOrDefault(v => v.Nome == criterio.Key);
            if (variavel == null || !variavel.Descricao.Contains(criterio.Value))
            {
                return false; // Se algum critério não for correspondido, a regra não se aplica
            }
        }

        return true; // Todos os critérios foram correspondidos
    }

}
