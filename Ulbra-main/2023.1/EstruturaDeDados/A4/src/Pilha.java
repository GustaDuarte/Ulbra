public class Pilha {
    private int[] array;
    private int topo;

    public Pilha(int tamanho) {
        array = new int[tamanho];
        topo = -1;
    }

    public void push(int valor) {
        if (topo == array.length - 1) {
            System.out.println("A pilha está cheia");
        } else {
            topo++;
            array[topo] = valor;
        }
    }

    public int pop() {
        if (topo == -1) {
            System.out.println("A pilha está vazia");
            return -1;
        } else {
            int valor = array[topo];
            topo--;
            return valor;
        }
    }

    public boolean isEmpty() {
        return topo == -1;
    }
}
