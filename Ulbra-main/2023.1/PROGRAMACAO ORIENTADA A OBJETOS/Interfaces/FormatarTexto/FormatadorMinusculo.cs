using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace FormatarTexto
{
    public class FormatadorMinusculo : IFormatarTexto
    {
        public string Formatar(string texto)
        {
            return Console.WriteLine(texto.ToLower());
        }

    }
}