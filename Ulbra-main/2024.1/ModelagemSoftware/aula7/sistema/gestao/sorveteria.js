class Sorveteria {
    constructor(nome, endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    salvar() {
        console.log(`Sorveteria ${this.nome} (${this.endereco}) salva.`);
    }
}