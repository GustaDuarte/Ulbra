class Funcionario {
    constructor(nome, cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    salvar() {
        console.log(`Funcionário ${this.nome} (${this.cargo}) salvo.`);
    }

    prepararCopoSorvete(pedidoSorvete) {
        console.log(`Copo de sorvete preparado para o pedido ${pedidoSorvete.pedido}.`);
        return `Copo de sorvete para o pedido ${pedidoSorvete.pedido}`;
    }
}