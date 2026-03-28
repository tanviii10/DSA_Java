import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KruskalsAlgo {

    static class Edge{
        int u,v,weight;

        Edge(int u,int v,int w){
            this.u=u;
            this.v=v;
            this.weight=w;
        }
    }

    static int[] parent;
    static int[] size;

    public static int findParent(int node){
        if( node== parent[node]){
            return node;
        }
        return parent[node]=findParent(parent[node]);
    }

    public static void unionBySize(int u, int v){
        int pu=findParent(u);
        int pv=findParent(v);

        if(pu == pv) return;

        if(size[pu] < size[pv]){
            parent[pu]=pv;
            size[pv]=size[pv]+size[pu];
        }
        else{
            parent[pv]=pu;
            size[pu]=size[pu]+size[pv];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter thr no. of Vertices: ");
        int V = sc.nextInt();
        System.out.print("Enter thr no. of edges : ");
        int E = sc.nextInt();

        ArrayList<Edge> edges = new ArrayList<>();

        // input edges
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            edges.add(new Edge(u, v, w));
        }

        // Step 1: sort edges
        Collections.sort(edges, (a, b) -> a.weight - b.weight);

        // Step 2: initialize DSU
        parent = new int[V + 1];
        size = new int[V + 1];

        for (int i = 1; i <= V; i++) {
            parent[i] = i;
            size[i] = 1;
        }

        int mstWeight = 0;

        // Step 3: process edges
        for (Edge e : edges) {

            if (findParent(e.u) != findParent(e.v)) {

                mstWeight += e.weight;
                unionBySize(e.u, e.v);
            }
        }

        System.out.println("MST Weight: " + mstWeight);

        sc.close();
    }
}
/*
Enter thr no. of Vertices: 6
Enter thr no. of edges : 9
5 4 9
5 1 4
1 4 1
4 3 5
4 2 3
1 2 2
3 6 8
3 2 3
2 6 7
MST Weight: 17
 */

