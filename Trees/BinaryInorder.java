import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryInorder {

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

    static void levelOrderTraversal(Node root) {

        if (root == null) return;

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null); 

        while (!q.isEmpty()) {

            Node temp = q.poll();

            // If level ends
            if (temp == null) {
                System.out.println();

                // if more nodes exist
                if (!q.isEmpty()) {
                    q.add(null);
                }
            }
            else {
                System.out.print(temp.data + " ");

                if (temp.left != null) {
                    q.add(temp.left);
                }

                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
    }

    static void inorder(Node root) {

    // base case
    if (root == null) {
        return;
    }

    // Left
    inorder(root.left);

    // Root
    System.out.print(root.data + " ");

    // Right
    inorder(root.right);

    }


    public static void main(String[] args) {

        System.out.println("Enter data (-1 for NULL):");

        Node root = buildTree();

        System.out.println("\nLevel Order Traversal (Line by Line):");
        levelOrderTraversal(root);

        System.out.println("\n\nInorder Traversal:");
        inorder(root);
    }
    
}
