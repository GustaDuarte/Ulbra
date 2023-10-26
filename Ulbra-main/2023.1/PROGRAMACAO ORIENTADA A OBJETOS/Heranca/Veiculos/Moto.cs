using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Veiculos
{
    public class Moto : Veiculo 
    {
        public Moto(string modelo) : base(modelo)
        {
            
        }
        public override void Acelerar() 
        {
            Console.WriteLine("Acelerando moto!");
        }
    }
}