using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Tde
{
    public class Funcoes
    {
        public double FuncaoRampa(double valor)
        {
            if (valor <= 0)
                return 0;
            else if (valor >= 1)
                return 1;
            else
                return valor;
        
        }
    }
}