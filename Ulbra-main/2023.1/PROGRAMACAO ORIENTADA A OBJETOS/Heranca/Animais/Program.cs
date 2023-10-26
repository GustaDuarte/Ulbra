using Animais;

/*Crie uma classe base chamada "Animal" que tenha uma propriedade "Nome" e um método "Falar()". 
Em seguida, crie duas classes derivadas chamadas "Cachorro" e "Gato" que herdam da classe "Animal" e implementam o método "Falar()" de maneiras diferentes. 
Por exemplo, o método "Falar()" da classe "Cachorro" pode imprimir "Au au!", enquanto o método "Falar()" da classe "Gato" pode imprimir "Miau!". 
A classe animal não poderá ser instanciada. Teste o código na classe program.*/

Cachorro cachorro = new Cachorro("Sccoby");
Gato gato = new Gato("Não sei");

cachorro.Falar();
gato.Falar();