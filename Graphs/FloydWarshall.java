import java.util.*;

public class FloydWarshall {

    public static void floydWarshall(int[][] dist, int V) {

        for (int k = 1; k <= V; k++) {
            for (int i = 1; i <= V; i++) {
                for (int j = 1; j <= V; j++) {

                    if (dist[i][k] != (int)1e9 && dist[k][j] != (int)1e9) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }

        //detect negative cycle
        for (int i = 1; i <= V; i++) {
            if (dist[i][i] < 0) {
                System.out.println("Negative Cycle Detected");
                return;
            }
        }

        System.out.println("Shortest distance matrix:");
        for (int i = 1; i <= V; i++) {
            for (int j = 1; j <= V; j++) {

                if (dist[i][j] == (int)1e9) {
                    System.out.print("INF ");
                } else {
                    System.out.print(dist[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int E = sc.nextInt();

        int[][] dist = new int[V + 1][V + 1];

        for (int i = 1; i <= V; i++) {
            for (int j = 1; j <= V; j++) {
                if (i == j) dist[i][j] = 0;
                else dist[i][j] = (int)1e9;
            }
        }

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();

            dist[u][v] = w;
        }

        floydWarshall(dist, V);

        sc.close();
    }
}