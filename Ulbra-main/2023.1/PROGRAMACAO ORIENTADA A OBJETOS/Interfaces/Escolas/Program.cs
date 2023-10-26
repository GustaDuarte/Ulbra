using Escolas;
/* Detalhes em " ..Escola/exercicio" */
class Program
{  
    static void Main(string[] args)
    {
        Professor prof = new Professor("Cassio", 38);
        Aluno aluno = new Aluno("Gustavo", 22);
        Escola escola = new Escola();

        escola.ApresentarPessoa(prof);
        escola.ApresentarPessoa(aluno);
    }

}
