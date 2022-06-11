package Ayberk.DFS;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    private LinkedList<Integer> adjList[];
    private boolean visited[];

    Graph(int vertices){
        adjList = new LinkedList[vertices];
        visited = new boolean[vertices];

        for(int i = 0; i<vertices; i++){
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int src, int dest){
        adjList[src].add(dest);
    }

    void DFS(int vertex){
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int adj : adjList[vertex]) {
            if (!visited[adj]) {
                DFS(adj);
            }
        }

//        Iterator<Integer> iterator = adjList[vertex].listIterator();
//        while(iterator.hasNext()){
//            int adj = iterator.next();
//            if(!visited[adj]){
//                DFS(adj);
//            }
//        }
    }
}
