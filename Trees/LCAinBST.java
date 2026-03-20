public class LCAinBST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // 🌟 Iterative LCA
    static Node lca(Node root, int n1, int n2) {

        while (root != null) {

            // both in left
            if (n1 < root.data && n2 < root.data) {
                root = root.left;
            }
            // both in right
            else if (n1 > root.data && n2 > root.data) {
                root = root.right;
            }
            // split point
            else {
                return root;
            }
        }

        return null;
    }

    // insert function
    static Node insert(Node root, int data) {

        if (root == null) return new Node(data);

        if (data < root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);

        return root;
    }

    public static void main(String[] args) {

        int[] arr = {20, 10, 30, 5, 15, 25, 35};

        Node root = null;

        for (int i = 0; i < arr.length; i++) {
            root = insert(root, arr[i]);
        }

        int n1 = 5, n2 = 15;

        Node ans = lca(root, n1, n2);

        System.out.println("LCA: " + ans.data);
    }
}
