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
        int n = 7;

        parent = new int[n + 1];
        rank= new int [n+1];

        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            rank[i]= 1;
        }

        unionByRank(1,2);
        unionByRank(2, 3);
        unionByRank(4, 5);
        unionByRank(6, 7);
        unionByRank(5, 6);

        if (findParent(3) == findParent(7)) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }

        unionByRank(3, 7);

        if (findParent(3) == findParent(7)) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }
    }
}
