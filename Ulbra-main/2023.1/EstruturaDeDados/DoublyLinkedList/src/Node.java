public class Node {
    int value;
    Node next;
    Node prev;
    public Node(int value) { //inicializa o nó inserindo valor null no prev e next
        this.value = value;  //indicando que o nó ainda não está ligado a nenhum outro nó da lista, pois é o primeiro nó a ser criado.
        this.next = null;
        this.prev = null;
    }
}
