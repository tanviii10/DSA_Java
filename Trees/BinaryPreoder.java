import java.util.Scanner;

public class BinaryPreoder {
    
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

    static void preorder(Node root) {

    // base case
    if (root == null) {
        return;
    }

    // Root
    System.out.print(root.data + " ");

    // Left
    preorder(root.left);

    // Right
    preorder(root.right);
    }

    public static void main(String[] args) {

        System.out.println("Enter data (-1 for NULL):");

        Node root = buildTree();

        System.out.println("\n\nPreorder Traversal:");
        preorder(root);
    }
}
