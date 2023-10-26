using System;

namespace Aprendendo_OO
{
    public class ContaBancaria
    {
        //caracteristicas
        public double Saldo{get; private set;}
        public int Numero { get; private set; }

        public ContaBancaria(double saldo, int numero)
        {
            this.Saldo = saldo;
            this.Numero = numero;
        }

        public void Depositar(double valor){
            Saldo += valor;
        }

        public void Sacar(double valor){
            if(Saldo >= valor){
                Saldo -= valor;
            }else{
                Console.WriteLine($"Saldo insuficiente: {Saldo}");
            }
        }
        
    }
}