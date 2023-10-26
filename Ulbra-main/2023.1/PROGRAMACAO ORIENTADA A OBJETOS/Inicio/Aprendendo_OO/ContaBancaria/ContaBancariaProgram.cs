/*Crie uma classe chamada "ContaBancaria" que tenha dois atributos: "Saldo" e "Numero". 
Crie dois métodos: "Depositar" e "Sacar". O método "Depositar" deve receber um valor como parâmetro e acrescentar esse valor ao saldo da conta. 
O método "Sacar" deve receber um valor como parâmetro e subtrair esse valor do saldo da conta, desde que haja saldo suficiente. 
Crie um objeto dessa classe e utilize os métodos para realizar transações bancárias.	*/
using System;

namespace Aprendendo_OO
{
    class ContaBancariaProgram
    {
        static void Main(string[] args){

        ContaBancaria minhaConta = new ContaBancaria(0, 1234);
        int x =0;
        int num =0;        
        
            do{
                Console.WriteLine("Selecione a operacao desejada:");
                    Console.WriteLine("1- Depositar");
                    Console.WriteLine("2- Sacar");
                    Console.WriteLine("0- Encerrar\n");
                    num = int.Parse(Console.ReadLine());

                    switch (num)
                    {
                        case 1: {
                            Console.WriteLine("Informe o valor a ser depositado:");
                            double valor1 = double.Parse(Console.ReadLine());
                            minhaConta.Depositar(valor1);
                            Console.WriteLine("Saldo atual: " + minhaConta.Saldo);
                        break;
                        }
                        case 2: {
                            Console.WriteLine("Informe o valor que quer sacar:");
                            double valor1 = double.Parse(Console.ReadLine());
                            minhaConta.Sacar(valor1);
                            Console.WriteLine("Saldo atual: " + minhaConta.Saldo);
                            break;
                        }
                        case 0:
                            x = 1;
                        break;

                        default:
                            Console.WriteLine("Opção inválida.\n");
                        break;
                    }
            } while (x == 0);
        }
    }
}
