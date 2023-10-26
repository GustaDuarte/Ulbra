using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ServicoPagamento
{
    class PagamentoCartao : IServicoPagamento {
        public void EfetuarPagamento(double valor) {
            Console.WriteLine($"Pagamento de R${valor} efetuado com cartão de crédito.");
        }

        public void EstornarPagamento(double valor) {
            Console.WriteLine($"Pagamento de R${valor} estornado do cartão de crédito.");
        }
    }
}