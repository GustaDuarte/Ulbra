using Animais;

/*Crie uma interface IAnimal com o método EmitirSom(). 
Em seguida, crie as classes Cachorro, Gato e Papagaio que implementam a interface IAnimal com sua própria implementação do método EmitirSom(). 
Em um programa, instancie as três classes e chame o método EmitirSom() de cada uma.*/
class Program
{
    static void Main(string[] args) 
    {
        Cachorro c = new Cachorro();
        c.EmitirSom();

        Gato g = new Gato();
        g.EmitirSom();

        Papagaio p = new Papagaio();
        p.EmitirSom();
    }

}



