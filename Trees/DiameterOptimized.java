import java.util.Scanner;

public class DiameterOptimized {
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

    static class Pair {
        int height;
        int diameter;

        Pair(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
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

    // Optimized diameter
    static Pair diameter(Node root) {

        if (root == null) {
            return new Pair(0, 0);
        }

        Pair left = diameter(root.left);
        Pair right = diameter(root.right);

        int height = Math.max(left.height, right.height) + 1;

        int op1 = left.diameter;
        int op2 = right.diameter;
        int op3 = left.height + right.height + 1;

        int dia = Math.max(op3, Math.max(op1, op2));

        return new Pair(height, dia);
    }

    public static void main(String[] args) {

        System.out.println("Enter nodes (-1 for NULL)");

        Node root = buildTree();

        Pair ans = diameter(root);

        System.out.println("Diameter of Tree: " + ans.diameter);
    }
}
