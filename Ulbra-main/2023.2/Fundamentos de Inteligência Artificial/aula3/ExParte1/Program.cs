using System;

namespace ExParte1
{    
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Digite o valor: ");
            double valor = Convert.ToDouble(Console.ReadLine());

            FuncaoAtivacao funcao;

            Console.Write("Escolha a função de ativação (LR, FR ou FS): ");
            string escolha = Console.ReadLine();

            switch (escolha)
            {
                case "LR":
                    funcao = new LR();
                    break;
                case "FR":
                    funcao = new FR();
                    break;
                case "FS":
                    funcao = new FS();
                    break;
                default:
                    Console.WriteLine("Função de ativação inválida!");
                    return;
            }

            double saida = funcao.Calcular(valor);

            Console.WriteLine("Saída: " + saida);
        }
    }
}

