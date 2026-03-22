import java.util.*;
public class DFS_itr {

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void dfsStack(int start, ArrayList<ArrayList<Integer>> adj, int V) {

        boolean[] visited = new boolean[V + 1];
        Stack<Integer> stack = new Stack<>();

        //push start node
        stack.push(start);

        while (!stack.isEmpty()) {

            int node = stack.pop();

            if (!visited[node]) {
                visited[node] = true;
                System.out.print(node + " ");
            }

            // push neighbors
            for (int i = adj.get(node).size() - 1; i >= 0; i--) {
                int neighbor = adj.get(node).get(i);

                if (!visited[neighbor]) {
                    stack.push(neighbor);
                }
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

        System.out.print("DFS using Stack: ");
        dfsStack(1, adj, V);
        sc.close();
    }
}
    
