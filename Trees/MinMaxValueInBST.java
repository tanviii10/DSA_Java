import java.util.Scanner;

public class MinMaxValueInBST {

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

    static Node minValue(Node root){

        Node temp=root;
        while(temp.left != null){
           temp=temp.left;
        }
        return temp;
    }

    static Node maxValue(Node root){

        Node temp=root;
        while(temp.right != null){
           temp=temp.right;
        }
        return temp;
    }
    public static void main(String[] args) {

        Node root = null;
        //8 3 1 6 7 4 10 14 13 -1
        root = takeInput(root);

        Node min = minValue(root);
        Node max = maxValue(root);

        System.out.println("Minimum value in BST: " + min.data);
        System.out.println("Maximum value in BST: " + max.data);
            
    }
    
}
