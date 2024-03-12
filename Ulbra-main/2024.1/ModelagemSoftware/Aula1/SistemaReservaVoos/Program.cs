namespace SistemaReservaVoos
{
    class Program
    {
        static void Main(string[] args)
        {
            Voo voo = new Voo("LATAM", "Porto Alegre", "Nova York", new DateTime(2024, 03, 15, 8, 0, 0), 700.00f);
            Console.WriteLine(voo.InformacoesVoo());
        }
    }
}
