import java.util.Scanner;

public class CountLeafNodes {

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

    static int countLeaf(Node root) {

        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            return 1;
        }

        return countLeaf(root.left)+ countLeaf(root.right);
    }

    public static void main(String[] args) {

        System.out.println("Enter data :");

        Node root = buildTree();

        System.out.println("\n\nTotal Leaf Nodes: " + countLeaf(root));
    }
}
