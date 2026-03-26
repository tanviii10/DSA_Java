import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Dijkstra {

    static class Pair{
        int node;
        int dist;

        Pair(int n,int d){
            node=n;
            dist=d;
        }
    }

    static void addEdge(ArrayList<ArrayList<Pair>>adj, int u, int v,int w){
        adj.get(u).add(new Pair(v,w));
        adj.get(v).add(new Pair(u, w));
    }
    static void dijkstraPQ(ArrayList<ArrayList<Pair>>adj, int V,int sourse){

        int dist[]=new int[V+1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->(a.dist-b.dist));

        dist[sourse]=0;
        pq.add(new Pair(sourse, 0));

        while (!pq.isEmpty()) {

            Pair curr=pq.poll();
            int node=curr.node;
            int d=curr.dist;

            for(int i=0; i < adj.get(node).size() ; i++){
                Pair neighbor=adj.get(node).get(i);

                int adjNode=neighbor.node;
                int adjweight=neighbor.dist;

                if(d + adjweight < dist[adjNode]){
                    dist[adjNode]= d + adjweight;
                    pq.add(new Pair(adjNode, dist[adjNode]));
                }
            }
        }
        System.out.println("Shortest distances:");
        for (int i = 1; i <= V; i++) {
            System.out.println(i + " -> " + dist[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter no. of vertices :");
        int V=sc.nextInt();
        System.out.print("Enter no of edges :");
        int E=sc.nextInt();

        ArrayList<ArrayList<Pair>>adj=new ArrayList<>();

        for(int i=0; i <= V ; i++){
            adj.add(new ArrayList<>());
        }

        System.out.println("Enter node with weight :");
        for(int i=0; i < E ; i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            int w=sc.nextInt();

            addEdge(adj , u , v, w);
        }

        System.out.println("enter starting node :");
        int source=sc.nextInt();

        dijkstraPQ(adj, V, source);
        sc.close();
    }
}
/*
Enter no. of vertices :6
Enter no of edges :8
Enter node with weight :
0 1 4
0 2 4
1 2 2
2 3 3
2 4 1
2 5 6
3 5 2
4 5 3
enter starting node :
0
Shortest distances:
1 -> 4
2 -> 4
3 -> 7
4 -> 5
5 -> 8
6 -> 2147483647
*/