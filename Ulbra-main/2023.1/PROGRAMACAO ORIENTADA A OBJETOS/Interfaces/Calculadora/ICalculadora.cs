using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Calculadora
{
    public interface ICalculadora
    {
        public double Somar(double a, double b);
        public double Subtrair(double a, double b);
        public double Multiplicar(double a, double b);
        public double Dividir(double a, double b);
    }
}