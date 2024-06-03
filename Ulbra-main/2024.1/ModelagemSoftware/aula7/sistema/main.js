const Cliente = require("./sistema/cliente");
const Sorvete = require("./sistema/sorvete");
const Funcionario = require("./sistema/funcionario");
const Atendente = require("./sistema/atendente");
const Sorveteria = require("./sistema/sorveteria");
const Pedido = require("./sistema/pedido");

let cliente = new Cliente("Rafael");
cliente.salvar();
let sorvete1 = new Sorvete("Morango");
sorvete1.salvar();
let sorvete2 = new Sorvete("Chocolate");
sorvete2.salvar();
let atendente = new Atendente("Carla");
atendente.salvar();
let sorveteria = new Sorveteria("Sorveteria Charmosa", "Rua Movimentada");
sorveteria.salvar();


let pedido = new Pedido("Em andamento", cliente, sorveteria);
pedido.adicionarSorvete(sorvete1);
pedido.adicionarSorvete(sorvete2);

pedido.entregar();