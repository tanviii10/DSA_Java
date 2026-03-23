import java.util.ArrayList;
import java.util.Scanner;

public class CycleDirGrapthDFS {

    static void addEdge(ArrayList<ArrayList<Integer>>adj,int a,int b){
        adj.get(a).add(b);
    }
    static boolean dfs(int start, boolean visited[],boolean reccStack[],ArrayList<ArrayList<Integer>>adj){

        visited[start] = true;
        reccStack[start] = true;

        for (int i = 0; i < adj.get(start).size(); i++) {
            int neighbor = adj.get(start).get(i);

            if (!visited[neighbor]) {
                if (dfs(neighbor, visited, reccStack, adj)) {
                    return true;
                }
            }
            else if (reccStack[neighbor]) {
                return true; // cycle found
            }
        }

        reccStack[start] = false; // backtrack
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter no of vertices");
        int V=sc.nextInt();
        System.out.print("enter no. of edges ");
        int E=sc.nextInt();
        
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();

        for(int i=0; i <= V ;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i < E ; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();

            addEdge(adj,a,b);
        }
        sc.close();
        boolean visited[]=new boolean[V+1];
        boolean reccStack[]=new boolean[V+1];

        for(int i=0 ; i <= V ;i++){
            if(!visited[i]){
                if(dfs(i,visited,reccStack,adj)){
                    System.out.println("cycle dectected");
                    return;
                }
            }
        }
        System.out.println("no cycle");

    }
}
