using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Veiculos
{
    public abstract class Veiculo 
    {
        public string Modelo { get; set; }
        public Veiculo(string modelo)
        {
            Modelo = modelo;
        }
        public virtual void Acelerar() 
        {
            Console.WriteLine("Acelerando veículo!");
        }
    }
}