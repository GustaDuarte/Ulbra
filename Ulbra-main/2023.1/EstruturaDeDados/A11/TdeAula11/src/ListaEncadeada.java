public class ListaEncadeada {
    private No primeiro;

    public ListaEncadeada() {
        this.primeiro = null;
    }

    public void inserir(int valor) {
        No novoNo = new No(valor);
        novoNo.setProximo(primeiro);
        primeiro = novoNo;
    }

    public void remover(int valor) {
        No atual = primeiro;
        No anterior = null;
        while (atual != null && atual.getValor() != valor) {
            anterior = atual;
            atual = atual.getProximo();
        }
        if (atual != null) {
            if (anterior == null) {
                primeiro = atual.getProximo();
            } else {
                anterior.setProximo(atual.getProximo());
            }
        }
    }

    public void imprimir() {
        No atual = primeiro;
        while (atual != null) {
            System.out.print(atual.getValor() + " ");
            atual = atual.getProximo();
        }
    }
}