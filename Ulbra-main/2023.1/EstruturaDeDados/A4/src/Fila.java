public class Fila {
    private int[] fila ;
    private int inicio;
    private int fim;
    private int tamanho;

    public Fila(int capacidade) {
        this.fila  = new int[capacidade];
        this.inicio = 0;
        this.fim = -1;
        this.tamanho = 0;
    }

    public void enqueue(int elemento) {
        if (this.tamanho == this.fila .length) {
            System.out.println("Fila cheia");;
        }

        fim++;
        if (this.fim == this.fila .length) {
            this.fim = 0;
        }

        fila [this.fim] = elemento;
        tamanho++;
    }

    public int dequeue() {
        if (this.tamanho == 0) {
            throw new RuntimeException("Fila vazia");
        }

        int elementoRemovido = this.fila [this.inicio];
        this.inicio++;
        if (this.inicio == this.fila .length) {
            this.inicio = 0;
        }

        this.tamanho--;
        return elementoRemovido;
    }

    public void imprimirFila() {
        if (tamanho == 0) {
            System.out.println("A fila está vazia.");
            return;
        }
        for (int i = 0; i < tamanho; i++) {
            int indice = (inicio + i) % fila.length;
            System.out.print(fila[indice] + " ");
        }
        System.out.println();
    }

}

