using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Veiculos
{
    public class Carro : Veiculo 
    {
        public Carro(string modelo) : base(modelo)
        {

        }
        public override void Acelerar() 
        {
            Console.WriteLine("Acelerando carro!");
        }
    }
}