using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace FormatarTexto
{
    public class FormatadorInvertido : IFormatarTexto
    {
        public string Formatar(string texto)
        {
            return Console.WriteLine(texto.Reverse().ToString());
        }

    }
}