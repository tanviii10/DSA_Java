import java.util.ArrayList;
import java.util.Scanner;

public class CycleDFS {

    static void addEdge(ArrayList<ArrayList<Integer>>adj, int a,int b){
        adj.get(a).add(b);
        adj.get(b).add(a);
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

        for(int i=0; i< E ; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();

            addEdge(adj , a,b);
        }

        boolean visited[]=new boolean[V+1];
        boolean cycle=false;

        for(int i=0 ;i <= V ;i++){
            if(!visited[i]){
                if(dfs(i , visited , adj, V)){
                    cycle=true;
                    break;
                }
            }
        }
        if(cycle){
            System.out.println("cycle dectected");
        }
        else{
            System.out.println("no cycle");
        }
    }
}
