using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ModelagemLivros
{
    public class Aluno
    {
        public string Nome { get; set; }
        public string Matricula { get; set; }
        public int Idade { get; set; }
        public string Curso { get; set; }

        public Aluno(string nome, string matricula, int idade, string curso)
        {
            this.Nome = nome;
            this.Matricula = matricula;
            this.Idade = idade;
            this.Curso = curso;
        }

        public string MostrarInformacoes()
        {
            return $"Nome: {Nome}\nMatrícula: {Matricula}\nIdade: {Idade}\nCurso: {Curso}";
        }
    }
}