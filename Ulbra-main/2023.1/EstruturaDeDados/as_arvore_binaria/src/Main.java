import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();

        // Adicionar elementos à árvore
        arvore.adicionar(6);
        arvore.adicionar(2);
        arvore.adicionar(9);
        arvore.adicionar(1);
        arvore.adicionar(4);
        arvore.adicionar(7);
        arvore.adicionar(10);

        // Mostrar a árvore em ordem, pré-ordem e pós-ordem
        System.out.println("Árvore em ordem:");
        arvore.mostrarEmOrdem(arvore.getRaiz(), "", "");

        System.out.println("\nÁrvore em pré-ordem:");
        arvore.mostrarPreOrdem(arvore.getRaiz(), "", "");

        System.out.println("\nÁrvore em pós-ordem:");
        arvore.mostrarPosOrdem(arvore.getRaiz(), "", "");

        // Percorrer a árvore recursivamente
        System.out.println("\nPercorrer a árvore em ordem:");
        arvore.percorrerArvoreRecursivamente(arvore.getRaiz());

        //Buscar um número
            Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite um número para buscar na árvore: ");
        int numeroBusca = scanner.nextInt();
        No noEncontrado = arvore.buscar(numeroBusca);
        if (noEncontrado != null) {
            System.out.println("Elemento " + numeroBusca + " encontrado na árvore.");
        } else {
            System.out.println("Elemento " + numeroBusca + " não encontrado na árvore.");
        }

        // Remover um número
        System.out.print("\nDigite um número para remover da árvore: ");
        int numeroRemover = scanner.nextInt();
        boolean removido = arvore.remover(numeroRemover);
        if (removido) {
            System.out.println("Elemento " + numeroRemover + " removido da árvore.");
        } else {
            System.out.println("Elemento " + numeroRemover + " não encontrado na árvore.");
        }

        // Mostrar a árvore após a remoção
        System.out.println("\nÁrvore em ordem após a remoção:");
        arvore.mostrarEmOrdem(arvore.getRaiz(), "", "");

    }
}
