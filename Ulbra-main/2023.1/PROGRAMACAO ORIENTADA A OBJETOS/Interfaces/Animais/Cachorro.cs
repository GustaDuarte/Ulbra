using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Animais
{
    public class Cachorro : IAnimais
    {
        public void EmitirSom()
        {
            Console.WriteLine("auau!");
        }
        
    }
}