package Ayberk.AdjacencyList;

import java.util.ArrayList;

public class Graph {
    int vertices;
    ArrayList<ArrayList<Integer>> adjacencyList;

    Graph(int V){
        vertices = V;
        adjacencyList = new ArrayList<>();

        for(int i = 0; i<vertices; i++){
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest){
        adjacencyList.get(src).add(dest);
        adjacencyList.get(dest).add(src);
    }

    void printGraph() {
        for (int i = 0; i < adjacencyList.size(); i++) {
            System.out.print("\nVertex " + i + ":");
            for (int j = 0; j < adjacencyList.get(i).size(); j++) {
                System.out.print(" -> " + adjacencyList.get(i).get(j));
            }
            System.out.println();
        }
    }
}
