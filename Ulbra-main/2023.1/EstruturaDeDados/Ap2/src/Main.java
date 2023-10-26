/* Criterios
Inicializar a lista vazia;
Inserir um elemento no início da lista;
Inserir um elemento no meio da lista, após um elemento específico;
Inserir um elemento no fim da lista;
Ordenar os elementos da lista utilizando o algoritmo de ordenação crescente A;
Ordenar os elementos da lista utilizando o algoritmo de ordenação decrescente B;
Imprimir os elementos da lista.*/

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        DoublyLinkedList list1 = new DoublyLinkedList();
        DoublyLinkedList list2 = new DoublyLinkedList();

        list.insertFirst(3);
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertLast(2);
        list.insertAfter(1, 7);
        list.printList();

        list1 = list.copyList();
        Ordination.insertionSort(list1);
        list1.printList();

        list2 = list.copyList();
        Ordination.selectionSort(list2);
        list2.printList();
    }
}