import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CycleBFS {

    static void addEdge(ArrayList<ArrayList<Integer>>adj, int a, int b){
        adj.get(a).add(b);
        adj.get(b).add(a);
    }

    static boolean isCycle(int start,boolean visited[], ArrayList<ArrayList<Integer>>adj,int V){

        Queue<int[]> q=new LinkedList<>();

        q.add(new int[]{start,-1});
        visited[start]=true;

        while (! q.isEmpty()) {
            int curr[]=q.poll();
            int node=curr[0];
            int parent=curr[1];

            for(int i=0; i < adj.get(node).size(); i++){
                int neighbor= adj.get(node).get(i);

                if(! visited[neighbor]){
                    visited[neighbor]=true;
                    q.add(new int[]{neighbor,node});
                }
                else if(neighbor != parent){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no. of vertices :");
        int V=sc.nextInt();
        System.out.println("Emter the no. of edges :");
        int E=sc.nextInt();

        ArrayList<ArrayList<Integer>>adj= new ArrayList<>();
        for(int i=0; i <= V ; i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0 ; i < E ; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();

            addEdge(adj,a,b);
        }

        boolean visited[] = new boolean[V + 1];
        boolean cycle = false;

        for(int i = 1; i <= V; i++){
            if(!visited[i]){
                if(isCycle(i, visited, adj, V)){
                    cycle = true;
                    break;
                }
            }
        }

        if(cycle ){
            System.out.println("cycle detected ");
        }
        else{
            System.err.println("no cycle");
        }
        sc.close();
    }
    /*  9
        8
        1 2
        2 3
        4 5
        5 6
        5 7
        6 8
        7 8
        8 9 */
    
}
