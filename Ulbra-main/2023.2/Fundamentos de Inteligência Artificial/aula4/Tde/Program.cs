namespace Tde
{
    class Program
    {
        static void Main(string[] args)
        {
            double[] entrada1 = { 1, 1 };
            double[] entrada2 = { 1, 0 };
            double[] entrada3 = { 0, 1 };
            double[] entrada4 = { 0, 0 };

            double[] saidaDesejada1 = { 1 };
            double[] saidaDesejada2 = { 1 };
            double[] saidaDesejada3 = { 0 };
            double[] saidaDesejada4 = { 0 };

            double[] pesos = { -1, -1 };
            double c = 1;

            int numIteracoes = 1000;

            Funcoes f = new Funcoes();

            for (int i = 0; i < numIteracoes; i++)
            {
                // Iteração com a primeira entrada
                double soma1 = entrada1[0] * pesos[0] + entrada1[1] * pesos[1];
                double saidaObtida1 = f.FuncaoRampa(soma1);
                double erro1 = saidaDesejada1[0] - saidaObtida1;

                pesos[0] += c * erro1 * entrada1[0];
                pesos[1] += c * erro1 * entrada1[1];

                // Treinamento com a segunda entrada
                double soma2 = entrada2[0] * pesos[0] + entrada2[1] * pesos[1];
                double saidaObtida2 = f.FuncaoRampa(soma2);
                double erro2 = saidaDesejada2[0] - saidaObtida2;

                pesos[0] += c * erro2 * entrada2[0];
                pesos[1] += c * erro2 * entrada2[1];

                // Treinamento com a terceira entrada
                double soma3 = entrada3[0] * pesos[0] + entrada3[1] * pesos[1];
                double saidaObtida3 = f.FuncaoRampa(soma3);
                double erro3 = saidaDesejada3[0] - saidaObtida3;

                pesos[0] += c * erro3 * entrada3[0];
                pesos[1] += c * erro3 * entrada3[1];

                // Treinamento com a quarta entrada
                double soma4 = entrada4[0] * pesos[0] + entrada4[1] * pesos[1];
                double saidaObtida4 = f.FuncaoRampa(soma4);
                double erro4 = saidaDesejada4[0] - saidaObtida4;

                pesos[0] += c * erro4 * entrada4[0];
                pesos[1] += c * erro4 * entrada4[1];
            }

            Console.WriteLine("Treinamento concluído!");
            //_____________________________________________________________________________________________________________________________________________________


            // Teste da rede neural treinada


            double testeSoma1 = entrada1[0] * pesos[0] + entrada1[1] * pesos[1];
            double testeSaida1 = f.FuncaoRampa(testeSoma1);
            Console.WriteLine($"Entrada: {entrada1[0]}, {entrada1[1]} | Saída Esperada: {saidaDesejada1[0]} | Saída da Rede: {testeSaida1}");

            double testeSoma2 = entrada2[0] * pesos[0] + entrada2[1] * pesos[1];
            double testeSaida2 = f.FuncaoRampa(testeSoma2);
            Console.WriteLine($"Entrada: {entrada2[0]}, {entrada2[1]} | Saída Esperada: {saidaDesejada2[0]} | Saída da Rede: {testeSaida2}");

            double testeSoma3 = entrada3[0] * pesos[0] + entrada3[1] * pesos[1];
            double testeSaida3 = f.FuncaoRampa(testeSoma3);
            Console.WriteLine($"Entrada: {entrada3[0]}, {entrada3[1]} | Saída Esperada: {saidaDesejada3[0]} | Saída da Rede: {testeSaida3}");

            double testeSoma4 = entrada4[0] * pesos[0] + entrada4[1] * pesos[1];
            double testeSaida4 = f.FuncaoRampa(testeSoma4);
            Console.WriteLine($"Entrada: {entrada4[0]}, {entrada4[1]} | Saída Esperada: {saidaDesejada4[0]} | Saída da Rede: {testeSaida4}");
        }
    }
}
