import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BellmanFordAlgo{
     static class Edge {
        int u, v, w;

        Edge(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;
        }
    }

    public static void bellmanFord(int V, ArrayList<Edge> edges, int source) {

        int[] dist = new int[V + 1];
        Arrays.fill(dist, (int)1e9);

        dist[source] = 0;

        //Relax edges V-1 times
        for (int i = 1; i <= V - 1; i++) {

            for (int j = 0; j < edges.size(); j++) {

                Edge e = edges.get(j);

                if (dist[e.u] != (int)1e9 &&
                    dist[e.u] + e.w < dist[e.v]) {

                    dist[e.v] = dist[e.u] + e.w;
                }
            }
        }

        //Check negative cycle
        for (int j = 0; j < edges.size(); j++) {

            Edge e = edges.get(j);

            if (dist[e.u] != (int)1e9 &&
                dist[e.u] + e.w < dist[e.v]) {

                System.out.println("Negative Cycle Detected");
                return;
            }
        }

        System.out.println("Shortest distances:");
        for (int i = 1; i <= V; i++) {
            System.out.println(i + " -> " + dist[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int E = sc.nextInt();

        ArrayList<Edge> edges = new ArrayList<>();

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            edges.add(new Edge(u, v, w));
        }

        int source = sc.nextInt();

        bellmanFord(V, edges, source);

        sc.close();
    }
}
/*
6
7
0 1 5
1 2 -2
1 5 -3
5 3 1
2 3 6
2 4 3
3 4 -2
0  
Shortest distances:
1 -> 5
2 -> 3
3 -> 3
4 -> 1
5 -> 2
6 -> 1000000000
*/