using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Pagamentos
{
    public class CartaoCredito : IPagamento
    {
        public void Pagar(double valor)
        {
            Console.WriteLine($"Pagamento de R${valor:F2} realizado com cartão de crédito.");
        }
    }
}