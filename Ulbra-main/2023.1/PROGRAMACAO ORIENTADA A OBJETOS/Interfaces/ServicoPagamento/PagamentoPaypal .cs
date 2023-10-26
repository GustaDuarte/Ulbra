using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ServicoPagamento
{
    class PagamentoPaypal : IServicoPagamento {
        public void EfetuarPagamento(double valor) {
            Console.WriteLine($"Pagamento de R${valor} efetuado com Paypal.");
        }

        public void EstornarPagamento(double valor) {
            Console.WriteLine($"Pagamento de R${valor} estornado do Paypal.");
        }
    }
}