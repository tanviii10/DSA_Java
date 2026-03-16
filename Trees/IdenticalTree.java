import java.util.Scanner;

public class IdenticalTree {

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

        System.out.println("right of : "+data);
        root.right=buildTree();

        return root;
    }
    static boolean isIdentical(Node r1,Node r2){
        if( r1 == null && r2 ==null){
            return true;
        }
        if( r1 == null && r2 != null){
            return false;
        }
        if(r1 != null && r2 == null){
            return false;
        }

        boolean left=isIdentical(r1.left, r2.left);
        boolean right=isIdentical(r1.right, r2.right);

        boolean value=r1.data == r2.data;

        if(left && right && value){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        
        System.out.println("enter data for tree 1: ");
        Node r1=buildTree();

        System.out.println("enter data for tree 2: ");
        Node r2=buildTree();

        System.out.println("is both trees identical ? "+isIdentical(r1, r2));
    }
    
}
