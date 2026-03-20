public class KthSamllest {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    
    static int count = 0;
    static int ans = -1;

    // 🌟 Kth Smallest
    static void solve(Node root, int k) {

        if (root == null) return;

        // left
        solve(root.left, k);

        // root
        count++;
        if (count == k) {
            ans = root.data;
            return;
        }

        // right
        solve(root.right, k);
    }

    static int kthSmallest(Node root, int k) {
        count = 0;
        ans = -1;
        solve(root, k);
        return ans;
    }

    // insert for building BST
    static Node insert(Node root, int data) {

        if (root == null) return new Node(data);

        if (data < root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);

        return root;
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 7, 2, 4, 6, 8};

        Node root = null;

        for (int i = 0; i < arr.length; i++) {
            root = insert(root, arr[i]);
        }

        int k = 3;

        System.out.println("Kth Smallest: " + kthSmallest(root, k));
    }
}
