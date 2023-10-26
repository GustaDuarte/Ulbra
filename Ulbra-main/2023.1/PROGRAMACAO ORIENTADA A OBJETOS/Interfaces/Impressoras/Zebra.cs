using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Impressoras
{
    public class Zebra : IImpressoraDeCodigoDeBarras
    {
        private int resolucao = 600;
        private string tamanhoEtiqueta = "15cm x 7cm";
        private string tipoEtiqueta = "Poliéster";

        public void ImprimirEtiqueta(Produto produto)
        {
            Console.WriteLine($"Imprimindo etiqueta para produto {produto.Id} na impressora Zebra...");
            Console.WriteLine($"Código de barras: {produto.CodigoBarras}");
            Console.WriteLine($"Preço: {produto.Preco}");
            Console.WriteLine($"Resolução: {resolucao}dpi");
            Console.WriteLine($"Tamanho da etiqueta: {tamanhoEtiqueta}");
            Console.WriteLine($"Tipo da etiqueta: {tipoEtiqueta}");
            Console.WriteLine("Etiqueta impressa com sucesso!\n");
        }
    }
}