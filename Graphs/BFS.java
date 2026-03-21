import java.util.*;

public class BFS{

    // Add edge
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    // BFS function
    public static void bfs(int start, ArrayList<ArrayList<Integer>> adj, int V) {

        boolean[] visited = new boolean[V + 1];  // 1-based
        Queue<Integer> q = new LinkedList<>();

        // Step 1: start node
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {

            int node = q.poll();   // remove
            System.out.print(node + " ");

            // visit neighbors
            for (int i = 0; i < adj.get(node).size(); i++) {
                int neighbor = adj.get(node).get(i);

                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int E = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // create graph (1-based)
        for (int i = 0; i <= V; i++) {
            adj.add(new ArrayList<>());
        }

        // input edges
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            addEdge(adj, u, v);
        }
        sc.close();
        System.out.print("BFS Traversal: ");
        bfs(1, adj, V);   // start from node 1
    }
}