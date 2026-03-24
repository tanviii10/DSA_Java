import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ShortestPathUndirBFS {

    static void addEdge(ArrayList<ArrayList<Integer>>adj, int a,int b){
        adj.get(a).add(b);
        adj.get(b).add(a);
    }

    static void ShortestPath(int V, ArrayList<ArrayList<Integer>>adj, int source,int dest){

        boolean visited[]=new boolean[V+1];
        int parent[]=new int[V+1];

        Queue<Integer> q=new LinkedList<>();

        for( int i=0; i<= V;i++){
            parent[i]=-1;
        }

        q.add(source);
        visited[source]=true;

        while (!q.isEmpty()) {

            int node=q.poll();

            if(node == dest){
                break;
            }

            for(int i=0; i< adj.get(node).size(); i++){
                int neighbor=adj.get(node).get(i);

                if(!visited[neighbor]){
                    visited[neighbor]=true;
                    parent[neighbor]=node;
                    q.add(neighbor);
                }
            }  
        }
        if(!visited[dest]){
            System.out.println("no path exist");
            return;
        }

        ArrayList<Integer> path=new ArrayList<>();
        int current=dest;

        while (current != -1) {
            path.add(current);
            current=parent[current];
        }

        Collections.reverse(path);

        System.out.println("shortest path");
        for(int i=0 ; i<path.size(); i++){
            System.out.print(path.get(i)+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter no. of vertices :");
        int V=sc.nextInt();
        System.out.print("Enter no of edges :");
        int E=sc.nextInt();

        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0; i <= V ; i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0; i < E ; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();

            addEdge(adj , a,b);
        }

        System.out.print("enter source : ");
        int source=sc.nextInt();

        System.out.print("enter destination : ");
        int dest=sc.nextInt();

        ShortestPath( V, adj,source,dest);
        sc.close();
    }
    
}
/*
Enter no. of vertices :8
Enter no of edges :9
1 2
1 4
2 5
5 8
1 3
3 8
4 6
6 7
7 8
enter source : 1
enter destination : 8
shortest path
1 3 8
*/
