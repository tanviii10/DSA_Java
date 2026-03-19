import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BSTTraversal {

    static class  Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static void levelOrder(Node root){

        if(root == null){
            return;
        }

        Queue<Node> q=new LinkedList<>();

        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node temp=q.poll();

            if(temp == null){
                System.out.println();

                if(!q.isEmpty()){
                    q.add(null);
                }
            }
            else{
                System.out.print(temp.data+" ");

                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
        }

    }
    static Node insertIntoBST(Node root, int data) {

        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertIntoBST(root.left, data);
        } else {
            root.right = insertIntoBST(root.right, data);
        }

        return root;
    }

    static Node takeInput(Node root) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data To build BST:");

        int data = sc.nextInt();
       
        while (data != -1) {
            root = insertIntoBST(root, data);
            data = sc.nextInt();
        }
        sc.close();
        return root;
    }
    //Inorder
    static void Inorder(Node root){

        if(root == null){
            return;
        }

        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    //Preorder
    static void preorder(Node root){

        if(root == null){
            return ;
        }

        System.out.print(root.data+ " ");

        preorder(root.left);
        preorder(root.right);
    }
    //postorder
    static void postorder(Node root){

        if(root == null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {

        Node root = null;
        //8 3 1 6 7 4 10 14 13 -1
        root = takeInput(root);

        System.out.println("printing BST : ");
        levelOrder(root);

        System.out.println("Inorder BST ");
        Inorder(root);
        System.out.println();

        System.err.println("Preorder BST ");
        preorder(root);
        System.out.println();
        
        System.out.println("postorder BST ");
        postorder(root);
        
    }
    
}
