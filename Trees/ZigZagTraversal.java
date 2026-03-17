import java.util.LinkedList;
import java.util.Queue;

public class ZigZagTraversal {

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
 
    static void zigzag(Node root){

        if(root == null){
            return;
        }

        Queue<Node> q=new LinkedList<>();
        q.add(root);

        boolean leftToRight=true;

        while(!q.isEmpty()){

            int size=q.size();
            int ans[]=new int[size];

            for(int i=0 ; i< size; i++){
                Node temp=q.poll();

                int index;
                if(leftToRight){
                    index =i;
                }
                else{
                    index=size- i -1;
                }

                ans[index]=temp.data;

                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
            }

            for(int i=0 ; i<ans.length ;i++){
                System.out.print(ans[i]+" ");
            }
            System.out.println();
            leftToRight = ! leftToRight;
        }
    }

    public static void main(String[] args) {
        
        Node root=new Node(1);
        root.left=new Node(3);
        root.right=new Node(5);
        root.left.left=new Node(7);
        root.left.right=new Node(11);
        root.right.right=new Node(17);

        System.out.println("zig zag traversal: ");
        zigzag(root);
    }
    
}
