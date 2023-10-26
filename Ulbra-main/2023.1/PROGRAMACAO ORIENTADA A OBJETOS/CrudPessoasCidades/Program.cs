using CrudPessoasCidades;
class Program
{  
    static void Main(string[] args)
    {
        PersonRepository repository = new PersonRepository();
        CityRepository cityRepository = new CityRepository();
        bool sair = false;

        while(!sair)
        {   
            Console.WriteLine("Escolha uma opção:");
            Console.WriteLine("1 - Adicionar pessoa");
            Console.WriteLine("2 - Adicionar cidade");
            Console.WriteLine("3 - Listar pessoas");
            Console.WriteLine("4 - Listar cidades");
            Console.WriteLine("5 - Atualizar pessoa");
            Console.WriteLine("6 - Atualizar cidade");
            Console.WriteLine("7 - Remover pessoa");
            Console.WriteLine("8 - Remover cidade");
            Console.WriteLine("0 - Sair");
            
            int op = int.Parse(Console.ReadLine());
            
            switch (op)
            {
                case 1:
                    Console.WriteLine("Inserir nova pessoa *****************************************************************");
                    
                    int id = repository.GetUltimoId() + 1; //para incrementar o id automaticamente 

                    Console.Write("Nome: ");
                    string name = Console.ReadLine();

                    Console.Write("Telefone: ");
                    string phone = Console.ReadLine();
                    
                    Console.Write("ID Cidade: ");
                    int idCity = int.Parse(Console.ReadLine());

                    City city = cityRepository.GetCityById(idCity);
                    
                    List<object> citiesIdAndName = cityRepository.GetCityAll();

        
                    foreach (var GetCityAll in citiesIdAndName)
                    {
                        int cityIdFor = (int)GetCityAll.GetType().GetProperty("Id").GetValue(GetCityAll);
                        string cityName = (string)GetCityAll.GetType().GetProperty("Name").GetValue(GetCityAll);
                        string cityUf = (string)GetCityAll.GetType().GetProperty("Uf").GetValue(GetCityAll);
                        if (cityIdFor == idCity)
                        {
                            city = new City(cityIdFor, cityName, cityUf);
                            break;
                        }
                    }

                    Person person = new Person(id, name, phone, city);
                    repository.InsertPerson(person, person.City);
                    break;

                case 2:
                    Console.WriteLine("Inserir nova cidade *****************************************************************");
                    id = cityRepository.GetUltimoCityId() + 1; //para incrementar o id automaticamente 

                    Console.Write("Cidade: ");
                    name = Console.ReadLine();

                    Console.Write("Uf: ");
                    string uf = Console.ReadLine();

                    city = new City(id, name, uf);
                    cityRepository.InsertCity(city);

                    break;

                case 3:
                    Console.WriteLine("Id\tNome\tTelefone\tCidade");
                    repository.ListPerson();
                    break;

                case 4:
                    Console.WriteLine("Id\tCidade\tUf");
                    cityRepository.ListCity();
                    break;

                case 5:
                    Console.Write("ID da pessoa que deseja atualizar: ");
                    int personId = int.Parse(Console.ReadLine());

                    Console.Write("Novo nome: ");
                    string newName = Console.ReadLine();

                    Console.Write("Novo telefone: ");
                    string newPhone = Console.ReadLine();

                    Console.Write("Id da nova cidade: ");
                    idCity = int.Parse(Console.ReadLine());

                    city = cityRepository.GetCityById(idCity);
                    citiesIdAndName = cityRepository.GetCityAll();
        
                    foreach (var GetCityAll in citiesIdAndName)
                    {
                        int cityIdFor = (int)GetCityAll.GetType().GetProperty("Id").GetValue(GetCityAll);
                        string cityName = (string)GetCityAll.GetType().GetProperty("Name").GetValue(GetCityAll);
                        string cityUf = (string)GetCityAll.GetType().GetProperty("Uf").GetValue(GetCityAll);
                        if (cityIdFor == idCity)
                        {
                            city = new City(cityIdFor, cityName, cityUf);
                            break;
                        }
                    }
                    repository.UpdatePerson(personId, newName, newPhone, city);

                    break;

                case 6:
                    Console.Write("ID da cidade que deseja atualizar: ");
                    int Id = int.Parse(Console.ReadLine());

                    Console.Write("Cidade: ");
                    newName = Console.ReadLine();

                    Console.Write("Uf: ");
                    string newUf = Console.ReadLine();

                    cityRepository.UpdateCity(Id, newName, newUf);

                    break;

                case 7:
                    Console.Write("ID da pessoa: ");
                    id = int.Parse(Console.ReadLine());
                    repository.DeletePerson(id);
                    break;

                case 8:
                    Console.Write("ID da cidade: ");
                    id = int.Parse(Console.ReadLine());
                    cityRepository.DeleteCity(id);
                    break;

                case 0:
                    sair = true;
                    break;

                default:
                    Console.WriteLine("Opção inválida");
                    break;
            }

            Console.WriteLine();
        
        }
        Environment.Exit(0);
    
    }
}
