using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ServicoPagamento
{
    class PagamentoBoleto : IServicoPagamento {
        public void EfetuarPagamento(double valor) {
            Console.WriteLine($"Pagamento de R${valor} efetuado com boleto bancário.");
        }

        public void EstornarPagamento(double valor) {
            Console.WriteLine($"Pagamento de R${valor} estornado do boleto bancário.");
        }
    }     
}