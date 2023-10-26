using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Impressoras
{
    public class Elgin : IImpressoraDeCodigoDeBarras
    {
        private int resolucao = 300;
        private string tamanhoEtiqueta = "10cm x 5cm";
        private string tipoEtiqueta = "Papel adesivo";

        public void ImprimirEtiqueta(Produto produto)
        {
            Console.WriteLine($"Imprimindo etiqueta para produto {produto.Id} na impressora Elgin...");
            Console.WriteLine($"Código de barras: {produto.CodigoBarras}");
            Console.WriteLine($"Preço: {produto.Preco}");
            Console.WriteLine($"Resolução: {resolucao}dpi");
            Console.WriteLine($"Tamanho da etiqueta: {tamanhoEtiqueta}");
            Console.WriteLine($"Tipo da etiqueta: {tipoEtiqueta}");
            Console.WriteLine("Etiqueta impressa com sucesso!\n");
        }
    }
}