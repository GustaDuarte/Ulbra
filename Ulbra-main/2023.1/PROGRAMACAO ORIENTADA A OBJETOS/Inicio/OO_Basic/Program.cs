using Aula02_OO_basic;

//instaciar um objeto

Garrafa garrafaDoGustavo = new Garrafa(1234, "branca", 2001, "beatfull garrafa", 30);

Console.WriteLine(garrafaDoGustavo.AnoFabricacao + " " + garrafaDoGustavo.Cor);

Console.WriteLine("digite um numero inteiro:");
var retorno = Console.ReadLine();
Console.WriteLine("Voce digitou " + retorno);