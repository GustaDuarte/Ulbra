/* Implemente uma lista duplamente encadeada que possua as seguintes funcionalidades:
- Inserir um elemento no início da lista
- Inserir um elemento no fim da lista
- Remover um elemento do início da lista
- Remover um elemento do fim da lista
- Obter o valor do elemento que está na posição N da lista (considere que a primeira posição é 0)
- Imprimir a lista completa

- Escreva um programa que utilize a lista duplamente encadeada implementada para realizar as seguintes operações:
- Insira os valores [5, 8, 3, 2] no início da lista, nesta ordem.
- Insira o valor 7 no fim da lista.
- Remova o elemento que está no início da lista.
- Obtenha o valor do elemento que está na posição 2 da lista.
- Remova o elemento que está no fim da lista.
- Imprima a lista completa.
- Imprima a lista completa de trás para frente */
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertFirst(5);
        list.insertFirst(8);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertLast(7);
        list.removeFirst(); //remove o elemento 2
        System.out.println(list.get(2)); //retorna o elemento na lista pelo seu índice
        list.removeLast(); // remove o elemento 7
        list.printList();
        list.printListReverse();
    }
}