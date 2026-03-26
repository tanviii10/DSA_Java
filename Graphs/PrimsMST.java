import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PrimsMST {

    static class  Pair {
        int node;
        int weight;
    
        Pair(int n,int w){
            node=n;
            weight=w;
        } 
    }

    static void addEdge(ArrayList<ArrayList<Pair>> adj,int u,int v,int w){
        adj.get(u).add(new Pair(v, w));
        adj.get(v).add(new Pair(u, w));
    }
    static void mst(ArrayList<ArrayList<Pair>> adj,int V){

        boolean visited[]=new boolean[V+1];
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.weight-b.weight);

        pq.add(new Pair(1, 0));
        int sum=0;

        while (!pq.isEmpty()) {

            Pair curr=pq.poll();
            int node=curr.node;
            int wt=curr.weight;

            if (visited[node]) continue;

            visited[node] = true;
            sum += wt;

            for(int i=0; i< adj.get(node).size(); i++){
                Pair neighbor=adj.get(node).get(i);

                if(!visited[neighbor.node]){
                    pq.add(new Pair(neighbor.node,neighbor.weight));
                }
            }  
        }
        System.out.println("minimum spannig tree :"+sum);
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

        mst(adj, V);
        sc.close();
    }
}
/*
Enter no. of vertices :5
Enter no of edges :6
Enter node with weight :
0 1 2
0 2 1
1 2 1
2 4 2
2 3 2
3 4 1
minimum spannig tree :5
*/
