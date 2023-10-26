public class No {
    private int valor;
    private No proximo;

    public No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}

//No representa um nó da lista encadeada e possui um valor e uma referência para o próximo nó.
// Já a classe ListaEncadeada possui uma referência para o primeiro nó da lista e implementa os métodos para inserir, remover e imprimir elementos na lista.