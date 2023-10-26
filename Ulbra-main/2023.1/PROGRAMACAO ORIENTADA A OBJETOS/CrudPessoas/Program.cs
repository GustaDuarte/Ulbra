using CrudPessoas;
class Program
{  
    static void Main(string[] args)
    {
        PersonRepository repository = new PersonRepository();
        bool sair = false;

        while(!sair)
        {   
            Console.WriteLine("Escolha uma opção:");
            Console.WriteLine("1 - Adicionar pessoa");
            Console.WriteLine("2 - Listar pessoas");
            Console.WriteLine("3 - Atualizar pessoa");
            Console.WriteLine("4 - Remover pessoa");
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
                    
                    Console.Write("Cidade: ");
                    int idCity = repository.GetUltimoCityId() + 1; //para incrementar o id automaticamente 

                    string nameCity = Console.ReadLine();

                    City city = new City(idCity, nameCity);
                    Person person = new Person(id, name, phone, city);

                    repository.InsertPerson(person, person.City);

                    break;
                    
                case 2:
                    Console.WriteLine("Id\tNome\tTelefone\tCidade");
                    repository.ListPerson();
                    break;
                case 3:
                    Console.Write("ID da pessoa que deseja atualizar: ");
                    int personId = int.Parse(Console.ReadLine());

                    Console.Write("Novo nome: ");
                    string newName = Console.ReadLine();

                    Console.Write("Novo telefone: ");
                    string newPhone = Console.ReadLine();

                    Console.Write("Nova cidade: ");
                    string newCity = Console.ReadLine();

                    repository.UpdatePerson(personId, newName, newPhone, newCity);

                    break;
                case 4:
                    Console.Write("ID da pessoa: ");
                    id = int.Parse(Console.ReadLine());
                    repository.DeletePerson(id);
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
