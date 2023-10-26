public class TesteFila {
    public static void main(String[] args) {
        Fila fila = new Fila(5);

        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);
        fila.enqueue(40);
        fila.enqueue(50);

        fila.imprimirFila();

        System.out.println("Elemento removido: " + fila.dequeue());

        fila.imprimirFila();
    }
}