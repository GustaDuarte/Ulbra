using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Pagamentos
{
    public class Cliente
    {   private double _valorCompra;
        private IPagamento _pagamento;

        public Cliente(IPagamento pagamento)
        {
            _pagamento = pagamento;
        }

        public void Comprar(double valor)
        {
            _valorCompra = valor;
            _pagamento.Pagar(valor);
        }

        public double ValorCompra
        {
            get { return _valorCompra; }
            private set { _valorCompra = value; }
        }
    }
}