using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ServicoPagamento
{
    public interface IServicoPagamento
    {
        public void EfetuarPagamento(double valor);
        public void EstornarPagamento(double valor);
    }
}