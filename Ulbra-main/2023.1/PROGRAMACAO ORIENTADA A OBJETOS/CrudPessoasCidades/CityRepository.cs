using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace CrudPessoasCidades
{
    public class CityRepository
    {
        static List<City> cities = new List<City>();
        static int ultimoCityId = 0;

        public void InsertCity(City city)
        {
            ultimoCityId++;
            city.GetType().GetProperty("Id").SetValue(city, ultimoCityId, null);
            cities.Add(city);
        }

        public List<object> GetCityAll()
        {
            return cities.Select(c => new { Id = c.Id, Name = c.Name, Uf = c.Uf }).ToList<object>();
        }
                
        public City GetCityById(int id)
        {
            return cities.FirstOrDefault(c => c.Id == id);

        }

        public int GetUltimoCityId()
        {
            return ultimoCityId;
        }

        public void ListCity()
        {
            foreach (City city in cities)
            {
                Console.WriteLine($"{city.Id}\t{city.Name}\t{city.Uf}");
            }
        }

        public void UpdateCity(int id, string name, string uf)
        {
            City city = cities.Find(c => c.Id == id); //verifica se o atributo Id no objeto p é igual ao valor da variavel id;
            if (city != null)
            {
                city.Name = name;
                city.Uf = uf;
                Console.WriteLine("Cidade atualizada com sucesso");
            }
            else
            {
                Console.WriteLine("Cidade não encontrada");
            }
        }

        public void DeleteCity(int id)
        {
            City city = cities.Find(c => c.Id == id);
            if (city == null)
            {
                Console.WriteLine("Cidade não encontrada");
                return;
            }
            cities.Remove(city);

            Console.WriteLine("Cidade removida com sucesso");
        }
    }
}