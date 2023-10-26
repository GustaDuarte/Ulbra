import java.util.*;
public class DijkstraAlgorithm {
    public static int dijkstra(Graph graph, int source, int destination) {
        int numVertices = graph.getNumVertices();

        // Inicialize uma estrutura de dados para armazenar as distâncias mínimas até cada parada de ônibus
        int[] distanciasMinimas = new int[numVertices];
        Arrays.fill(distanciasMinimas, Integer.MAX_VALUE);
        distanciasMinimas[source] = 0;

        // Inicialize uma estrutura de dados para armazenar os nós visitados
        Set<Integer> nosVisitados = new HashSet<>();

        // Inicialize uma estrutura de dados para armazenar o caminho até cada parada de ônibus
        int[] caminho = new int[numVertices];
        Arrays.fill(caminho, -1);

        // Enquanto houver nós não visitados
        while (!nosVisitados.contains(destination)) {
            // Escolha o nó com a menor distância mínima que ainda não foi visitado
            int noAtual = -1;
            int menorDistancia = Integer.MAX_VALUE;
            for (int i = 0; i < numVertices; i++) {
                if (!nosVisitados.contains(i) && distanciasMinimas[i] < menorDistancia) {
                    noAtual = i;
                    menorDistancia = distanciasMinimas[i];
                }
            }

            // Marque o nó como visitado
            nosVisitados.add(noAtual);

            // Para cada vizinho não visitado do nó atual
            for (int vizinho = 0; vizinho < numVertices; vizinho++) {
                if (!nosVisitados.contains(vizinho) && graph.getWeight(noAtual, vizinho) > 0) {
                    // Calcule a distância até o vizinho somando a distância mínima do nó atual com o peso da aresta entre eles
                    int novaDistancia = distanciasMinimas[noAtual] + graph.getWeight(noAtual, vizinho);
                    // Se a nova distância for menor do que a distância mínima atual do vizinho, atualize a distância mínima
                    if (novaDistancia < distanciasMinimas[vizinho]) {
                        distanciasMinimas[vizinho] = novaDistancia;
                        caminho[vizinho] = noAtual;
                    }
                }
            }
        }

        // Imprime a rota completa entre a parada de origem e a parada de destino
        System.out.print("Rota: " + destination);
        int noAtual = caminho[destination];
        while (noAtual != -1) {
            System.out.print(" <- " + noAtual);
            noAtual = caminho[noAtual];
        }
        System.out.println();

        // Retorna a distância mínima até a parada de destino
        return distanciasMinimas[destination];
    }
}
