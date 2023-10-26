namespace Animais
{
    public class Gato : Animal 
    {
        public Gato(string name) : base(name)
        {

        }
        public override void Falar() 
        {
            Console.WriteLine("Miau!");
        }
    }
}
