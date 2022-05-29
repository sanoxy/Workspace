package Erkan.AdjacencyMatrix;

public class Graph {
    boolean matrix[][];
    int numVertices;

    public Graph(int numVertices){
        this.numVertices = numVertices;
        matrix = new boolean[numVertices][numVertices];
    }

    public void addEdge(int src, int dest){
        matrix[src][dest] = true;
        matrix[dest][src] = true;
    }

    public void removeEdge(int src, int dest){
        matrix[src][dest] = false;
        matrix[dest][src] = false;
    }

    // Print the matrix
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numVertices; i++) {
            s.append(i + ": ");
            for (boolean j : matrix[i]) {
                s.append((j ? 1 : 0) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }
}
