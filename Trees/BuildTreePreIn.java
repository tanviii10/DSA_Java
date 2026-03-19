public class BuildTreePreIn{

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static int preIndex = 0;

    // 🌟 Build Tree Function
    static Node solve(int[] inorder, int[] preorder, int start, int end) {

        // base case
        if (start > end) return null;

        // get root from preorder
        int element = preorder[preIndex++];
        Node root = new Node(element);

        // find position in inorder
        int pos = findPosition(inorder, element, start, end);

        // build left & right
        root.left = solve(inorder, preorder, start, pos - 1);
        root.right = solve(inorder, preorder, pos + 1, end);

        return root;
    }

    // helper to find index
    static int findPosition(int[] arr, int target, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    // 🌿 Inorder print (to verify)
    static void inorderPrint(Node root) {
        if (root == null) return;

        inorderPrint(root.left);
        System.out.print(root.data + " ");
        inorderPrint(root.right);
    }

    public static void main(String[] args) {

        int[] inorder = {4, 2, 5, 1, 3, 6};
        int[] preorder = {1, 2, 4, 5, 3, 6};

        Node root = solve(inorder, preorder, 0, inorder.length - 1);

        System.out.println("Inorder of constructed tree:");
        inorderPrint(root);
    }
}
