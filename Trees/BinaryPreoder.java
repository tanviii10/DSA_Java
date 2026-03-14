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

    static Node BuildTree(){

        int data=sc.nextInt();
        if(data == -1){
            return null;
        }

        Node root=new Node(data);

        System.out.println("Enter left of : ");
        root.left=BuildTree();

        System.out.println("Enter right of : ");
        root.right=BuildTree();

        return root;

    }

    static void preorder(Node root){

        if(root == null){
            return ;
        }

        System.out.print(root.data+ " ");

        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        System.out.println("Enter data (-1 for NULL):");

        Node root = BuildTree();

        System.out.println("\n\nPreorder Traversal:");
        preorder(root);
    }
}
