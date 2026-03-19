import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SearchBST {
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

    static boolean search(Node root, int data){
        Node temp=root;
        while (temp != null) {
            if( temp.data == data){
                return true;
            }

            if(temp.data > data){
                temp = temp.left;
            }
            else{
                temp=temp.right;
            }        
        }
        return false;
    }

    public static void main(String[] args) {

        Node root = null;
        //8 3 1 6 7 4 10 14 13 -1
        root = takeInput(root);

        System.out.println("printing BST : ");
        levelOrder(root);

        System.err.println("is data present in BST ? "+ search(root, 10));
        System.err.println("is data present in BST ? "+ search(root, 20));
        
    }
}
