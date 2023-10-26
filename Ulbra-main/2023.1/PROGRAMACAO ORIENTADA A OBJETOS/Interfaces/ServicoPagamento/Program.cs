using ServicoPagamento;

/*Crie uma interface IServicoPagamento com os métodos EfetuarPagamento() e EstornarPagamento(). 
Em seguida, crie as classes PagamentoCartao, PagamentoBoleto e PagamentoPaypal que implementam a interface IServicoPagamento com suas próprias implementações dos métodos. 
Em um programa, instancie as três classes e use cada uma para efetuar e estornar pagamentos diferentes.*/
class Program {
    static void Main(string[] args) {
        PagamentoCartao pagamentoCartao = new PagamentoCartao();
        pagamentoCartao.EfetuarPagamento(100.0);
        pagamentoCartao.EstornarPagamento(50.0);

        PagamentoBoleto pagamentoBoleto = new PagamentoBoleto();
        pagamentoBoleto.EfetuarPagamento(200.0);
        pagamentoBoleto.EstornarPagamento(100.0);

        PagamentoPaypal pagamentoPaypal = new PagamentoPaypal();
        pagamentoPaypal.EfetuarPagamento(300.0);
        pagamentoPaypal.EstornarPagamento(150.0);
    }
}