using System;

namespace Aprendendo_OO
{
    public class Pessoa
    {
        //caracteristicas
        public string Nome{get; private set;}
        public int Idade { get; private set; }

        public Pessoa(string nome, int idade)
        {
            this.Nome = nome;
            this.Idade = idade;
        }

        public string Apresentar(){
            return $"Nome: {this.Nome}\n {this.Idade}.";
        }
    }
}