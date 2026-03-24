import java.util.*;

public class ShortestPathDAG {

    // Pair class (node, weight)
    static class Pair {
        int node, weight;

        Pair(int n, int w) {
            node = n;
            weight = w;
        }
    }

    // Add directed weighted edge
    public static void addEdge(ArrayList<ArrayList<Pair>> adj, int u, int v, int w) {
        adj.get(u).add(new Pair(v, w));
    }

    // Topological sort using DFS
    public static void topoSort(int node, boolean[] visited, Stack<Integer> stack, ArrayList<ArrayList<Pair>> adj) {

        visited[node] = true;

        for (int i = 0; i < adj.get(node).size(); i++) {
            int neighbor = adj.get(node).get(i).node;

            if (!visited[neighbor]) {
                topoSort(neighbor, visited, stack, adj);
            }
        }

        stack.push(node);
    }

    public static void shortestPath(int V, ArrayList<ArrayList<Pair>> adj, int source) {

        boolean[] visited = new boolean[V + 1];
        Stack<Integer> stack = new Stack<>();

        // Step 1: topo sort
        for (int i = 1; i <= V; i++) {
            if (!visited[i]) {
                topoSort(i, visited, stack, adj);
            }
        }

        // Step 2: distance array
        int[] dist = new int[V + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[source] = 0;

        // Step 3: process nodes in topo order
        while (!stack.isEmpty()) {

            int node = stack.pop();

            if (dist[node] != Integer.MAX_VALUE) {

                for (int i = 0; i < adj.get(node).size(); i++) {

                    Pair p = adj.get(node).get(i);
                    int v = p.node;
                    int weight = p.weight;

                    if (dist[node] + weight < dist[v]) {
                        dist[v] = dist[node] + weight;
                    }
                }
            }
        }

        // print result
        System.out.println("Shortest distances:");
        for (int i = 1; i <= V; i++) {
            System.out.println(i + " -> " + dist[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int E = sc.nextInt();

        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for (int i = 0; i <= V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            addEdge(adj, u, v, w);
        }

        int source = sc.nextInt();

        shortestPath(V, adj, source);
        sc.close();
    }
}