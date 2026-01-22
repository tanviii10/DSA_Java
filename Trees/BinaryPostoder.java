import java.util.Scanner;

public class BinaryPostoder {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Scanner sc = new Scanner(System.in);

    static Node buildTree() {
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        Node root = new Node(data);

        System.out.println("Enter left of " + data);
        root.left = buildTree();

        System.out.println("Enter right of " + data);
        root.right = buildTree();

        return root;
    }

    static void postorder(Node root) {

    // base case
    if (root == null) {
        return;
    }

    // Left
    postorder(root.left);

    // Right
    postorder(root.right);

    // Root
    System.out.print(root.data + " ");

    }
    public static void main(String[] args) {

        System.out.println("Enter data (-1 for NULL):");

        Node root = buildTree();

        System.out.println("\n\nPostorder Traversal:");
        postorder(root);
    }
}
