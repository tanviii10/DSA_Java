import java.util.*;

public class BuildTreePostIn {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static int postIndex;

    // 🌟 Build Tree
    static Node solve(int[] inorder, int[] postorder, int start, int end) {

        // base case
        if (start > end) return null;

        // root from postorder
        int element = postorder[postIndex--];
        Node root = new Node(element);

        // find position in inorder
        int pos = findPosition(inorder, element, start, end);

        // IMPORTANT: build right first
        root.right = solve(inorder, postorder, pos + 1, end);
        root.left = solve(inorder, postorder, start, pos - 1);

        return root;
    }

    // helper function
    static int findPosition(int[] arr, int target, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    // inorder print to verify
    static void inorderPrint(Node root) {
        if (root == null) return;

        inorderPrint(root.left);
        System.out.print(root.data + " ");
        inorderPrint(root.right);
    }

    public static void main(String[] args) {

        int[] inorder = {4, 2, 5, 1, 3, 6};
        int[] postorder = {4, 5, 2, 6, 3, 1};

        postIndex = postorder.length - 1;

        Node root = solve(inorder, postorder, 0, inorder.length - 1);

        System.out.println("Inorder of constructed tree:");
        inorderPrint(root);
    }
}