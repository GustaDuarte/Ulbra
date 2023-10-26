namespace Animais
{
    public abstract class Animal
    {
        public string Name { get; set; }

        public Animal(string name)
        {
            Name = name;
        }

        public virtual void Falar()
        {
            Console.WriteLine("Animal falando...");
        }
    }
}
