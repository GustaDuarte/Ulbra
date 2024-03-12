namespace ModelagemPraia
{
    class Program
    {
        static void Main(string[] args)
        {
            Praia praia = new Praia("Praia de Capão da Canoa", "Av Beira Mar", "18°", "areia fofa");
            Console.WriteLine(praia.InformacoesPraia());
           
        }
    }
}