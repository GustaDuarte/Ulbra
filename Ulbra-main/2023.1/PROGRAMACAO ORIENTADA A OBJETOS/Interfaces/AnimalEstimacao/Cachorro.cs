using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace AnimalEstimacao
{
    public class Cachorro : IAnimalEstimacao
    {
        public string Nome { get; set; }
        public string Dono { get; set; }
    }
}