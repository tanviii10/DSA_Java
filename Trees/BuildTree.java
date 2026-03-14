import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BuildTree{

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

   static Node build(){
    int data=sc.nextInt();

    if( data == -1){
        return null;
    }

    Node root=new Node(data);

    System.out.println("Enter left of : "+data);
    root.left=build();

    System.out.println("Enter right of : "+ data);
    root.right=build();

    return root;
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

   public static void main(String[] args) {
    
    System.out.println("Enter data : ");
    Node root=build();

    System.out.println("level order traversal is : ");
    levelOrder(root);

   }
   /*
1
3
7
-1
-1
11
-1
-1
5
-1
17
-1
-1
*/

}