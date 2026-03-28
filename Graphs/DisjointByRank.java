import java.util.Scanner;

public class DisjointByRank {

    static int[] parent;
    static int[] rank;

    static int findParent(int node){
        if(node == parent[node]){
            return node;
        }

        return parent[node]=findParent(parent[node]);
    }

    static void unionByRank(int u,int v){
        int pu=findParent(u);
        int pv=findParent(v);

        if(pu == pv) return;

        if(rank[pu] < rank[pv]){
            parent[pu]=pv;
        }
        else if(rank[pv] < rank [pu]){
            parent[pv]=pu;
        }
        else{
            parent[pv]=pu;
            rank[pu]++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter no. of nodes : ");
        int n = sc.nextInt();
        System.out.print("Enter the no. of Operations : ");
        int q = sc.nextInt(); 

        parent = new int[n + 1];
        rank = new int[n + 1];

        // initialize
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }

        for (int i = 0; i < q; i++) {

            int type = sc.nextInt();
            int u = sc.nextInt();
            int v = sc.nextInt();

            if (type == 1) {
                unionByRank(u, v);
            } 
            else if (type == 2) {
                if (findParent(u) == findParent(v)) {
                    System.out.println("Same Set");
                } else {
                    System.out.println("Different Set");
                }
            }
        }

        sc.close();
    }
    
}
