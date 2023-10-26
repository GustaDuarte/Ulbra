using Veiculos;

/*Crie uma classe base chamada "Veiculo" que tenha uma propriedade "Modelo" e um método "Acelerar()". 
Em seguida, crie duas classes derivadas chamadas "Carro" e "Moto" que herdam da classe "Veiculo" e implementam o método "Acelerar()" de maneiras diferentes. 
Por exemplo, o método "Acelerar()" da classe "Carro" pode imprimir "Acelerando carro!", enquanto o método "Acelerar()" da classe "Moto" pode imprimir "Acelerando moto!". 
Teste o código na classe program.*/
class Program {
    static void Main(string[] args) {

        Carro carro1 = new Carro("Carro Esportivo");
        carro1.Acelerar();

        Moto moto1 = new Moto("Moto Custom");
        moto1.Acelerar();
    }
}