namespace ModelagemLivros
{
    class Program
    {
        static void Main(string[] args)
        {
            Aluno aluno = new Aluno("Gustavo", "2021001", 22, "ADS");
            Console.WriteLine(aluno.MostrarInformacoes());
        }
    }
}
