using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace CrudPessoasCidades
{
    public class PersonRepository
    {
        static List<Person> people = new List<Person>();
        static int ultimoId = 0;


        public void InsertPerson(Person person, City city)
        {
            ultimoId++;
            person.GetType().GetProperty("Id").SetValue(person, ultimoId, null);     
            people.Add(person);
        }


        public int GetUltimoId()
        {
            return ultimoId;
        }

        public void ListPerson()
        {
            foreach (Person person in people)
            {
                Console.WriteLine($"{person.Id}\t{person.Name}\t{person.Phone}\t{person.City.Name}");
            }
        }

        public void UpdatePerson(int id, string name, string phone, City city){
            Person person = people.Find(p => p.Id == id); //verifica se o atributo Id no objeto p é igual ao valor da variavel id;
            if (person != null)
            {
                person.Name = name;
                person.Phone = phone;
                person.City = city;
                Console.WriteLine("Pessoa atualizada com sucesso");
            }
            else
            {
                Console.WriteLine("Pessoa não encontrada");
            }
        }

        public void DeletePerson(int id)
        {
            Person person = people.Find(p => p.Id == id);
            if (person == null)
            {
                Console.WriteLine("Pessoa não encontrada");
                return;
            }
            people.Remove(person);

            Console.WriteLine("Pessoa removida com sucesso");
        }

    }


}