import java.util.*;
public class Fila {
    private List<Integer> elementos;
    public Fila() {
        elementos = new ArrayList<Integer>();
    }

    public void enfileirar(int valor) {
        elementos.add(valor);
    }

    public int desenfileirar() {
        if (elementos.isEmpty()) {
            throw new NoSuchElementException();
        }
        return elementos.remove(0);
    }

    public int tamanho() {
        return elementos.size();
    }

    public boolean vazia() {
        return elementos.isEmpty();
    }

    public List<Integer> ordenarBubbleSort(List<Integer> numeros) {
        int n = numeros.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (numeros.get(j) > numeros.get(j+1)) {
                    int temp = numeros.get(j);
                    numeros.set(j, numeros.get(j+1));
                    numeros.set(j+1, temp);
                }
            }
        }
        return numeros;
    }
}
