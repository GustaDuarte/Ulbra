using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Pagamentos
{
    public interface IPagamento
    {
        void Pagar(double valor);
    }
}