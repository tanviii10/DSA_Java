import java.util.Scanner;

public class BalancedTree {
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
    static int height(Node root){

        if(root == null){
            return 0;
        }

        int leftsubtree=height(root.left);
        int rightsubtree=height(root.right);

        int ans=Math.max(leftsubtree,rightsubtree)+1;

        return ans;
        
    }

    static boolean isBalance(Node root){

        if(root == null){
            return true;
        }

        boolean left=isBalance(root.left);
        boolean right=isBalance(root.right);

        boolean diff=height(root.left) - height(root.right) <= 1;

        if(left && right && diff ){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        
        System.out.println("enter data : ");
        Node root=buildTree();

        System.out.println("is balance : "+isBalance(root));
    }
}
