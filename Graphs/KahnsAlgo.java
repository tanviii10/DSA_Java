import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class KahnsAlgo {

    static void addEdge(ArrayList<ArrayList<Integer>>adj, int a,int b){
        adj.get(a).add(b);
    }

    static void topoSort(int V,ArrayList<ArrayList<Integer>>adj ){

        int indegree[]=new int[V+1];

        //find all indegrees
        for(int i=1 ; i <= V ;i ++){
            for(int j=0 ; j<adj.get(i).size() ;j++){
                int neighbor=adj.get(i).get(j);
                indegree[neighbor]++;
            }
        }

        //add to queue for indegree 0
        Queue<Integer> q=new LinkedList<>();

        for(int i=1; i<=V ;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }

        //process BFS
        ArrayList<Integer> result=new ArrayList<>();

        while(!q.isEmpty()){
            int node=q.poll();
            result.add(node);

            for(int i=0; i< adj.get(node).size(); i++){
                int neighbor=adj.get(node).get(i);

                indegree[neighbor]--;

                if(indegree[neighbor]==0){
                    q.add(neighbor);
                }

            }
        }

        //check cycle
        if(result.size() != V){
            System.out.println("cycle dectected, topological sort not possible");
        }
        else{
            System.out.println("topological sort :");
            for(int i=0; i<result.size(); i++){
                System.err.print(result.get(i)+" ");
            }
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
        sc.close();

        topoSort(V, adj);
        
    }
    
}
/*
Enter no. of vertices :5
Enter no of edges :5
1 2
1 3
3 5
2 5
5 4
topological sort :
1 2 3 5 4
 */
