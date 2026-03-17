public class LCA {

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

    static Node lca(Node root, int n1, int n2){
        if(root == null){
            return null;
        }

        if(root.data == n1 || root.data == n2){
            return root;
        }

        Node left=lca(root.left, n1, n2);
        Node right=lca(root.right, n1, n2);

        if(left != null && right != null){
            return root;
        }
        else if(left != null && right == null){
            return left;
        }
        else if(left == null && right != null){
            return right;
        }
        else{
            return null;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(8);
        root.right.right = new Node(6);
        root.right.right.left = new Node(9);

        int n1=3;
        int n2=8;

        Node ans=lca(root, n1, n2);
        System.out.println("LCA of "+ n1 + " and "+ n2+ " is "+ ans.data);
    }
    
}
