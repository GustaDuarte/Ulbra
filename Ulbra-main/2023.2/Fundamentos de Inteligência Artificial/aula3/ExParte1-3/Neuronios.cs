using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ExParte1_3
{
    public class Neuronios
    {
        private double peso;

        public Neuronios(double peso)
        {
            this.peso = peso;
        }

        public double CalcularSaida(double entrada)
        {
            return entrada * peso;
        }
    }
}
    
