import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
public class DequeMediaMovel {
    private Deque<Integer> deque;
    private int tamanho;
    public DequeMediaMovel(int tamanho) {
        deque = new LinkedList<Integer>();
        this.tamanho = tamanho;
    }

    public void adicionar(int numero) {
        if (deque.size() == tamanho) {
            deque.removeFirst();
        }
        deque.addLast(numero);
    }

    public double mediaMovel() {
        int soma = 0;
        for (int numero : deque) {
            soma += numero;
        }
        return (double) soma / deque.size();
    }

    public List<Double> calcularMediasMoveis(List<Integer> numeros, int k) {
        List<Double> mediasMoveis = new LinkedList<Double>();
        DequeMediaMovel dequeMediaMovel = new DequeMediaMovel(k);
        for (int numero : numeros) {
            dequeMediaMovel.adicionar(numero);
            if (dequeMediaMovel.deque.size() == k) {
                mediasMoveis.add(dequeMediaMovel.mediaMovel());
            }
        }
        return mediasMoveis;
    }
}
