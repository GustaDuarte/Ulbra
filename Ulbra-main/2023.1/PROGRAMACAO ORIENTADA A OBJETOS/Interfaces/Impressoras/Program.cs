using Impressoras;
/*Você está trabalhando em uma empresa de etiquetagem e precisa implementar um sistema que permita imprimir etiquetas de código de barras em diferentes tipos de impressoras. 
Para isso, você deve implementar uma interface IImpressoraDeCodigoDeBarras que define os métodos necessários para imprimir etiquetas de código de barras em diferentes impressoras. 
Cada impressora deve ser identificada por uma marca e deve ter um tipo de implementação de impressão de etiqueta diferente.*/

class Program
{
    static void Main(string[] args) 
    {
        // Cria uma lista de impressoras
        List<IImpressoraDeCodigoDeBarras> impressoras = new List<IImpressoraDeCodigoDeBarras>()
        {
            new Elgin(),
            new Zebra()
        };

        // Solicita o código de barras ao usuário
        Console.WriteLine("Informe o código de barras do produto a ser impresso:");
        string codigoBarras = Console.ReadLine();

        // Cria um objeto Produto com código de barras e preço fictícios
        Produto produto = new Produto()
        {
            Id = 1,
            CodigoBarras = codigoBarras,
            Preco = 10.99
        };

        // Chama o método ImprimirEtiqueta para cada impressora na lista
        foreach (IImpressoraDeCodigoDeBarras imp in impressoras)
        {
            imp.ImprimirEtiqueta(produto);
        }
        Console.ReadLine();
    }
}

