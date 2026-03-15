import java.util.Scanner;

public class BinaryPostoder {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static Scanner sc=new Scanner(System.in);
    static Node buildTree(){

        int data=sc.nextInt();
        if(data == -1){
            return null;
        }

        Node root=new Node(data);

        System.out.println("enter left of : "+data);
        root.left=buildTree();

        System.out.println("enter right of " +data);
        root.right=buildTree();

        return root;
    }

    static void postorder(Node root){

        if(root == null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {

        System.out.println("Enter data :");

        Node root = buildTree();

        System.out.println("\n\nPostorder Traversal:");
        postorder(root);
    }
}
