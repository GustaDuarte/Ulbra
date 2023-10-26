using Pagamentos;
/* Detalhes em " ..Pagamento/exercicio" */
class Program
{  
    static void Main(string[] args)
    {
        var cartao = new CartaoCredito();
        var boleto = new Boleto();

        var cliente1 = new Cliente(cartao);
        cliente1.Comprar(50);

        var cliente2 = new Cliente(boleto);
        cliente2.Comprar(100);
    }

}
