package Ayberk.AdjacencyMatrix;

public class Graph {
    private boolean adjMatrix[][];
    private int numVertices;

    public Graph(int numVertices){
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
    }

    public void addEdge(int src, int dest){
        adjMatrix[src][dest] = true;
        adjMatrix[dest][src] = true;
    }

    public void removeEdge(int src, int dest){
        adjMatrix[src][dest] = false;
        adjMatrix[dest][src] = false;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numVertices; i++) {
            s.append(i + ": ");
            for (boolean j : adjMatrix[i]) {
                s.append((j ? 1 : 0) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }
}
