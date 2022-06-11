package Ayberk.BFS;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    int V;
    private LinkedList<Integer> adjList[];

    public Graph(int vertices){
        V = vertices;
        adjList = new LinkedList[vertices];

        for(int i = 0; i<vertices; i++){
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int src, int dest){
        adjList[src].add(dest);
    }

    void BFS(int start){
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while(queue.size() != 0){
            start = queue.poll();
            System.out.print(start + " ");

            for (int n : adjList[start]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }

//            Iterator<Integer> iterator = adjList[start].listIterator();
//            while (iterator.hasNext()){
//                int n = iterator.next();
//                if(!visited[n]){
//                    visited[n] = true;
//                    queue.add(n);
//                }
//            }
        }
    }
}
