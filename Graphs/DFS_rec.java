import java.util.*;

public class DFS_rec{

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {

        visited[node] = true;
        System.out.print(node + " ");

        for (int i = 0; i < adj.get(node).size(); i++) {
            int neighbor = adj.get(node).get(i);

            if (!visited[neighbor]) {
                dfs(neighbor, visited, adj);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int E = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i <= V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            addEdge(adj, u, v);
        }

        boolean[] visited = new boolean[V + 1];

        System.out.print("DFS Traversal: ");
        dfs(1, visited, adj);
        sc.close();
    }
}