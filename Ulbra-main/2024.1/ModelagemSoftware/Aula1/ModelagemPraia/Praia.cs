using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ModelagemPraia
{
    public class Praia
    {
        public  string Nome { get; set; }
        public string Localizacao { get; set; }
        public string TemperaturaAgua { get; set; }
        public string TipoAreia { get; set; }

        public Praia(string nome, string localizacao, string temperaturaAgua, string tipoAreia)
        {
            this.Nome = nome;
            this.Localizacao = localizacao;
            this.TemperaturaAgua = temperaturaAgua;
            this.TipoAreia = tipoAreia;
        }

        public string InformacoesPraia ()
        {
            return $"Nome: {Nome}\nLocalizacao: {Localizacao}\nTemperatura da Agua: {TemperaturaAgua}\nTipo da Areia: {TipoAreia}";
        }
    }
}