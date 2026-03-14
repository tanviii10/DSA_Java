import java.util.Scanner;

public class BinaryInorder {

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
        
        int data =sc.nextInt();
        if(data == -1){
            return null;
        }

        Node root=new Node(data);

        System.out.println("Enter left of : "+data);
        root.left=buildTree();

        System.out.println("enter right of :"+data);
        root.right=buildTree();

        return root;
    }

    static void Inorder(Node root){

        if(root == null){
            return;
        }

        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    
    public static void main(String[] args) {

        System.out.println("enter data: ");

        Node root=buildTree();

        System.out.println("Inorder trversal : ");
        Inorder(root);

    }
    
}
