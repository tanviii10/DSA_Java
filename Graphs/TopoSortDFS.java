import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class TopoSortDFS {

    static void addEdge(ArrayList<ArrayList<Integer>>adj, int a,int b){
        adj.get(a).add(b);
    }

    static void dfs(int start, boolean visited[],Stack<Integer> s,ArrayList<ArrayList<Integer>>adj){

        visited[start]=true;

        for(int i=0 ;i < adj.get(start).size() ;i++){
            int neighbor=adj.get(start).get(i);

            if(!visited[neighbor]){
                dfs(neighbor, visited, s, adj);
            }
        }
        //after visiting all neighbor push to stack
        s.push(start);
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
        boolean visited[]=new boolean[V+1];
        Stack<Integer> s=new Stack<>();

        for(int i=0; i<=V ;i++){
            if(!visited[i]){
                dfs(i,visited,s,adj);
            }
        }

        System.out.println("topological sort :");
        while (!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        }
    }
}
/*
Enter no. of vertices :6
Enter no of edges :7
1 2
1 3
2 4
3 4
4 5
4 6
5 6
 */