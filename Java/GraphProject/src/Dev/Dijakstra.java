package Dev;

import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class Dijakstra {
    public int[] dist;

    public Set<Integer> settled;
    public PriorityQueue<Node> pq;

    public int V;
    List<List<Node>> adj;

    public Dijakstra(int v) {
        this.V = v;
        dist = new int[v];
        settled = new HashSet<>();
        pq = new PriorityQueue<Node>(V, new Node());
    }

    public void dijakstra(List<List<Node>> adj, int src) {
        this.adj = adj;

        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        pq.add(new Node(src, 0));

        dist[src - 1] = 0;

        while (settled.size() != V) {
            if (pq.isEmpty())
                return;

            int u = pq.remove().node;

            if (settled.contains(u))
                continue;

            settled.add(u);
            e_Neighbors(u);
        }
    }

    private void e_Neighbors(int u) {
        int edgeDistance = -1;
        int newDistance = -1;

        for (int i = 0; i < adj.get(u - 1).size(); i++) {
            Node v = adj.get(u - 1).get(i);

            if (!settled.contains(v.node)) {
                edgeDistance = v.cost;
                newDistance = dist[u - 1] + edgeDistance;

                if (newDistance < dist[v.node - 1]) {
                    dist[v.node - 1] = newDistance;
                }

                pq.add(new Node(v.node, dist[v.node - 1]));
            }
        }
    }
}
