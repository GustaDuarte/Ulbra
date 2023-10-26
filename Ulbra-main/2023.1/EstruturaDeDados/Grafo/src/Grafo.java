import java.util.ArrayList;
import java.util.List;

public class Grafo {
    private int numPessoas;
    private List<List<Integer>> adjacencias;

    // inicializa uma lista de adjacências vazia para cada pessoa no grafo
    public Grafo(int numPessoas) {
        this.numPessoas = numPessoas;
        this.adjacencias = new ArrayList<>(numPessoas);
        for (int i = 0; i < numPessoas; i++) {
            adjacencias.add(new ArrayList<>());
        }
    }

    public void adicionarAresta(int pessoa1, int pessoa2) {
        adjacencias.get(pessoa1).add(pessoa2);
        adjacencias.get(pessoa2).add(pessoa1);
    }

    public void imprimirGrafo() {
        for (int pessoa = 0; pessoa < numPessoas; pessoa++) {
            System.out.print("Pessoa " + pessoa + " é amiga de: ");
            for (int amigo : adjacencias.get(pessoa)) {
                System.out.print(amigo + " ");
            }
            System.out.println();
        }
    }
}
