using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Animais
{
    public class Gato : IAnimais
    {
        public void EmitirSom()
        {
            Console.WriteLine("miau!");
        }
    }
}