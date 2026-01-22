import java.util.*;

public class BinaryTreeLevelOrder {

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

    public static void main(String[] args) {

        System.out.println("Enter data (-1 for NULL):");

        Node root = buildTree();

        System.out.println("\nLevel Order Traversal (Line by Line):");
        levelOrderTraversal(root);
    }
}


/*
1
3
7
-1
-1
11
-1
-1
5
-1
17
-1
-1
*/