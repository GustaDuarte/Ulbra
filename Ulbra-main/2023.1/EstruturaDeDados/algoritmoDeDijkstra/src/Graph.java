public class Graph {
    private int numVertices;
    private int[][] adjacencyMatrix;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjacencyMatrix = new int[numVertices][numVertices];
    }
    public void addEdge(int source, int destination, int weight) {
        adjacencyMatrix[source][destination] = weight;
        adjacencyMatrix[destination][source] = weight;
    }
    public int getNumVertices() {
        return numVertices;
    }
    public int getWeight(int source, int destination) {
        return adjacencyMatrix[source][destination];
    }
}