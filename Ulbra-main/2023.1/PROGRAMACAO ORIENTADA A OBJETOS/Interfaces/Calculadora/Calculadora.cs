using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Calculadora
{
    public class Calculadora : ICalculadora
    {
        public double Somar(double a, double b) {
        return a + b;
        }

        public double Subtrair(double a, double b) {
            return a - b;
        }

        public double Multiplicar(double a, double b) {
            return a * b;
        }

        public double Dividir(double a, double b) {
            if (b == 0) {
                throw new DivideByZeroException("Divisão por zero não é permitida.");
            }
            return a / b;
        }
    }
}