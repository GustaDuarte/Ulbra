public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);
        lista.inserir(4);
        lista.inserir(5);

        System.out.print("Lista original: ");
        lista.imprimir();

        lista.remover(3);

        System.out.print("\nLista resultante: ");
        lista.imprimir();
    }
}
