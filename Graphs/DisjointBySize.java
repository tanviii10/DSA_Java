public class DisjointBySize{

    static int[] parent;
    static int[] size;

    public static int findParent(int node) {
        if (node == parent[node]) {
            return node;
        }
        return parent[node] = findParent(parent[node]);
    }

    public static void unionBySize(int u, int v) {
        int pu = findParent(u);
        int pv = findParent(v);

        if (pu == pv) return;

        if (size[pu] < size[pv]) {
            parent[pu] = pv;
            size[pv] += size[pu];
        } 
        else {
            parent[pv] = pu;
            size[pu] += size[pv];
        }
    }

    public static void main(String[] args) {

        int n = 7;

        parent = new int[n + 1];
        size = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            size[i] = 1;
        }

        unionBySize(1, 2);
        unionBySize(2, 3);
        unionBySize(4, 5);
        unionBySize(6, 7);
        unionBySize(5, 6);

        if (findParent(3) == findParent(7)) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }

        unionBySize(3, 7);

        if (findParent(3) == findParent(7)) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }
    }
}
    

