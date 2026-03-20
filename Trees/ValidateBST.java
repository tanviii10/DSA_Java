public class ValidateBST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // 🌟 Validate BST
    static boolean isBST(Node root, long min, long max) {

        // base case
        if (root == null) return true;

        // check range
        if (root.data <= min || root.data >= max) {
            return false;
        }

        // check left and right
        return isBST(root.left, min, root.data) &&
               isBST(root.right, root.data, max);
    }

    public static void main(String[] args) {

        // build tree
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(20);

        boolean ans = isBST(root, Long.MIN_VALUE, Long.MAX_VALUE);

        System.out.println("Is Valid BST: " + ans);
    }
}