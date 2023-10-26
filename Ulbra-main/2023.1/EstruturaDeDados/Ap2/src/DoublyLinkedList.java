//Inicializa a lista vazia
public class DoublyLinkedList {
    Node head;
    Node tail;
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Retorna o tamanho da lista
    public int size() {
        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    // Obtém o valor do elemento que está na posição N da lista
    public int get(int index) {
        if (index < 0 || index >= size()) { //verifica se o indice tem o tam da lista
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.value;
    }

    // Define o valor do elemento que está na posição N da lista
    public void set(int index, int value) {
        if (index < 0 || index >= size()) { //verifica se o indice tem o tam da lista
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        current.value = value;
    }

    // Inserir um elemento no início da lista
    public void insertFirst(int value) {
        Node newNode = new Node(value);

        if (head == null) { // verifica se a lista está vazia
            head = newNode;
            tail = newNode;
        } else { //nó é inserido no icinio da lista
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    //  Inserir um elemento no meio da lista, após um elemento específico
    public void insertAfter(int position, int newValue) {
        Node newNode = new Node(newValue);

        Node current = head;
        int currentPosition = 0;

        while (current != null && currentPosition < position) {
            current = current.next;
            currentPosition++;
        }

        if (current != null) {
            if (current == tail) {
                // Caso específico: Inserção após o último elemento
                newNode.prev = current;
                current.next = newNode;
                tail = newNode;
            } else {
                newNode.prev = current;
                newNode.next = current.next;
                current.next.prev = newNode;
                current.next = newNode;
            }
        }
    }

    // Inserir um elemento no fim da lista
    public void insertLast(int value) {
        Node newNode = new Node(value);

        if (tail == null) { // verifica se a lista está vazia
            head = newNode;
            tail = newNode;
        } else { //nó é inserido no fim da lista
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Cria uma cópia da lista
    public DoublyLinkedList copyList() {
        DoublyLinkedList newList = new DoublyLinkedList();

        Node current = head;
        while (current != null) {
            newList.insertLast(current.value);
            current = current.next;
        }

        return newList;
    }

    // Ordena a lista em ordem crescente utilizando o algoritmo insertion Sort
    public void insertionSort() {
        int size = size();

        for (int i = 1; i < size; ++i) {
            int key = get(i);
            int j = i - 1;

            while (j >= 0 && get(j) > key) {
                set(j + 1, get(j));
                j = j - 1;
            }

            set(j + 1, key);
        }
    }

    // Ordena a lista em ordem decrescente utilizando o algoritmo Selection Sort
    public void selectionSort() {
        int size = size();

        for (int i = 0; i < size - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < size; j++) {
                if (get(j) > get(maxIndex)) {
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                int temp = get(i);
                set(i, get(maxIndex));
                set(maxIndex, temp);
            }
        }
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
}
