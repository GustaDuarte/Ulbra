using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Ap2
{
    public abstract class Pessoa
    {
        public int Id { get;  set; }
        public string Nome { get;  set; }
        public string Cpf { get;  set; }
        public string Telefone { get; set; }
        public string Sexo { get; set; }
        public Endereco Endereco { get; set; }

        
    }
    
}