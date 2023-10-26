using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Threading.Tasks;

namespace Ap2
{
    [Table("Medicos")]
    public class Medico : Pessoa
    {
        public int Crm { get;  set; }
        public string Especialidade { get; set; }

        public List<Consulta> Consultas { get; set; }
        
        
    }
}