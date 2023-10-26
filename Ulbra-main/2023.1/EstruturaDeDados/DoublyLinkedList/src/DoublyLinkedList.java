public class DoublyLinkedList {
    Node head;
    Node tail;
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Inserir um elemento no início da lista
    public void insertFirst(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Inserir um elemento no fim da lista
    public void insertLast(int value) {
        Node newNode = new Node(value);

        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Remover um elemento do início da lista

    public void removeFirst() throws IndexOutOfBoundsException {
        if (head == null) {
            throw new IndexOutOfBoundsException("Cannot remove from an empty list");
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // Remover um elemento do fim da lista
    
    public void removeLast() throws IndexOutOfBoundsException {
        if (tail == null) {
            throw new IndexOutOfBoundsException("Cannot remove from an empty list");
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // Obter o valor do elemento que está na posição N da lista (considere que a primeira posição é 0)
    public int get(int index) {
        if (index < 0) {
            return -1;
        }

        Node current = head;

        for (int i = 0; i < index; i++) {
            if (current == null) {
                return -1;
            }

            current = current.next;
        }

        if (current == null) {
            return -1;
        }

        return current.value;
    }

    // Imprimir a lista completa
    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }

        System.out.println();
    }

    // Imprima a lista completa de trás para frente
    public void printListReverse() {
        Node current = tail;

        while (current != null) {
            System.out.print(current.value + " ");
            current = current.prev;
        }

        System.out.println();
    }
}
