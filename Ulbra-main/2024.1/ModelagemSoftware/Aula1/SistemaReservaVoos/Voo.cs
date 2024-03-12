using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace SistemaReservaVoos
{
    public class Voo
    {
        public string CompanhiaAerea { get; set; }
        public string Origem { get; set; }
        public string Destino { get; set; }
        public DateTime DataPartida { get; set; }
        public float PrecoPassagem { get; set; }

        public Voo(string companhiaAerea, string origem, string destino, DateTime dataPartida, float precoPassagem)
        {
            this.CompanhiaAerea = companhiaAerea;
            this.Origem = origem;
            this.Destino = destino;
            this.DataPartida = dataPartida;
            this.PrecoPassagem = precoPassagem;
        }

        public string InformacoesVoo()
        {
            return $"Companhia Aérea: {CompanhiaAerea}\nOrigem: {Origem}\nDestino: {Destino}\nData de Partida: {DataPartida}\nPreço da Passagem: {PrecoPassagem:C2}";
        }
    }
}