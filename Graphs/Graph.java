import java.util.*;

public class Graph{

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
        //reverse conection
    }

    public static void printGraph(ArrayList<ArrayList<Integer>> adj, int V) {
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        System.out.println("Enter edges (u v): ");

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            addEdge(adj, u, v);
        }
        sc.close();
 
        printGraph(adj, V);
    }
}