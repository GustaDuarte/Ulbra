namespace Animais
{
    public class Cachorro : Animal 
    {
        public Cachorro(string name) : base(name)
        {

        }
            public override void Falar() 
        {
            Console.WriteLine("Au au!");
        }
    }
}
