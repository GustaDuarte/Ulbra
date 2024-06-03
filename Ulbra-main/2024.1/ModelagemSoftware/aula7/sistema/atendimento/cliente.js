class Cliente {
    constructor(nome) {
        this.nome = nome;
    }

    salvar() {
        console.log(`Cliente ${this.nome} salvo.`);
    }
}