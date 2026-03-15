import java.util.Scanner;

public class DiameterOfTree {
    
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

    static int diameter(Node root){

        if( root == null){
            return 0;
        }

        int op1=diameter(root.left);
        int op2=diameter(root.right);
        int op3=height(root.left)+ height(root.right)+1;

        int ans=Math.max(op3,Math.max(op1,op2));

        return ans;
    }

    public static void main(String[] args) {
        
        System.out.println("enter data : ");
        Node root=buildTree();

        System.out.println("diamter of tree "+ diameter(root));
    }
}
