class Pedido {
    constructor(status, cliente, sorveteria) {
        this.status = status;
        this.cliente = cliente;
        this.sorveteria = sorveteria;
        this.sorvetes = [];
    }

    adicionarSorvete(sorvete) {
        console.log(`Sorvete de ${sorvete.sabor} adicionado ao pedido.`);
        this.sorvetes.push(sorvete);
    }

    entregar() {
        console.log(`Pedido entregue para ${this.cliente.nome}.`);
    }
}