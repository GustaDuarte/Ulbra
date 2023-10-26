using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace CrudPessoasCidades
{
    public class City
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public string Uf { get; set; }

        public City(int id, string name, string uf)
        {
            Id = id;
            Name = name;
            Uf = uf;
        }
    }
}