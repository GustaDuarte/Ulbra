using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace CrudPessoasCidades
{
    public class Person
    {
        public int Id { get; private set;} //obter a propriedade "Id" da instância de Pessoa e, em seguida, definir seu valor usando o método SetValue(). O último argumento do método SetValue() é usado para propriedades indexadas e deve ser definido como null para propriedades não indexadas. 
        public string Name { get; set; }
        public string Phone { get; set; }
        public City City { get; set; }

        public Person(int id, string name, string phone, City city)
        {   
            Id = id;
            Name = name;
            Phone = phone;
            City = city;
        }
    }
}