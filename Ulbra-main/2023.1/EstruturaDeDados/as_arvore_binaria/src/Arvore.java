import java.util.LinkedList;
import java.util.Queue;

public class Arvore {
    private No raiz;

    public Arvore() {
        this.raiz = null;
    }

    public void adicionar(int valor) {
        raiz = adicionarNo(raiz, valor);
    }

    private No adicionarNo(No no, int valor) {
        if (no == null) {
            return new No(valor);
        }

        if (valor < no.valor) {
            no.esquerda = adicionarNo(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = adicionarNo(no.direita, valor);
        }

        return no;
    }

    public boolean remover(int valor) {
        if (buscar(valor) == null) {
            return false;
        }

        raiz = removerNo(raiz, valor);
        return true;
    }

    private No removerNo(No no, int valor) {
        if (no == null) {
            return null;
        }

        if (valor < no.valor) {
            no.esquerda = removerNo(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = removerNo(no.direita, valor);
        } else {
            if (no.esquerda == null) {
                return no.direita;
            } else if (no.direita == null) {
                return no.esquerda;
            }

            No sucessor = encontrarSucessor(no.direita);
            no.valor = sucessor.valor;
            no.direita = removerNo(no.direita, sucessor.valor);
        }

        return no;
    }

    private No encontrarSucessor(No no) {
        while (no.esquerda != null) {
            no = no.esquerda;
        }
        return no;
    }

    public No buscar(int valor) {
        return buscarNo(raiz, valor);
    }

    private No buscarNo(No no, int valor) {
        if (no == null || no.valor == valor) {
            return no;
        }

        if (valor < no.valor) {
            return buscarNo(no.esquerda, valor);
        } else {
            return buscarNo(no.direita, valor);
        }
    }

    public No getRaiz() {
        return raiz;
    }

    public void percorrerArvoreRecursivamente(No no) {
        if (no != null) {
            percorrerArvoreRecursivamente(no.esquerda);
            System.out.print(no.valor + " ");
            percorrerArvoreRecursivamente(no.direita);
        }
    }

    public void mostrarArvore(No raiz) {
        if (raiz == null) {
            System.out.println("Árvore vazia.");
            return;
        }

        mostrarEmOrdem(raiz, "", "");
        System.out.println();
        mostrarPosOrdem(raiz, "", "");
        System.out.println();
        mostrarPreOrdem(raiz, "", "");
    }

    public void mostrarEmOrdem(No no, String prefixo, String espaco) {
        if (no != null) {
            mostrarEmOrdem(no.esquerda, prefixo + espaco + "|  ", "|  ");
            System.out.println(prefixo + "+--" + no.valor);
            mostrarEmOrdem(no.direita, prefixo + espaco + "|  ", "   ");
        }
    }

    public void mostrarPosOrdem(No no, String prefixo, String espaco) {
        if (no != null) {
            mostrarPosOrdem(no.esquerda, prefixo + espaco + "|  ", "|  ");
            mostrarPosOrdem(no.direita, prefixo + espaco + "|  ", "|  ");
            System.out.println(prefixo + "+--" + no.valor);
        }
    }

    public void mostrarPreOrdem(No no, String prefixo, String espaco) {
        if (no != null) {
            System.out.println(prefixo + "+--" + no.valor);
            mostrarPreOrdem(no.esquerda, prefixo + espaco + "|  ", "|  ");
            mostrarPreOrdem(no.direita, prefixo + espaco + "|  ", "   ");
        }
    }

    public void adicionarElementos(int[] elementos) {
        for (int elemento : elementos) {
            adicionar(elemento);
        }
    }
}