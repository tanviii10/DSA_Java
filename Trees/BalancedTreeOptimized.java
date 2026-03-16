import java.util.Scanner;

public class BalancedTreeOptimized {
    
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static Scanner sc = new Scanner(System.in);

    // Build Tree
    static Node buildTree() {

        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        Node root = new Node(data);

        System.out.println("Enter left child of " + data);
        root.left = buildTree();

        System.out.println("Enter right child of " + data);
        root.right = buildTree();

        return root;
    }

    // Optimized height check
    static int checkHeight(Node root) {

        if (root == null) {
            return 0;
        }

        int left = checkHeight(root.left);
        if (left == -1) return -1;

        int right = checkHeight(root.right);
        if (right == -1) return -1;

        if (Math.abs(left - right) > 1) {
            return -1;
        }

        return Math.max(left, right) + 1;
    }

    static boolean isBalanced(Node root) {
        return checkHeight(root) != -1;
    }

    public static void main(String[] args) {

        System.out.println("Enter nodes (-1 for NULL)");

        Node root = buildTree();

        if (isBalanced(root)) {
            System.out.println("Tree is Balanced");
        } else {
            System.out.println("Tree is Not Balanced");
        }
    }
}
