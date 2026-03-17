public class BoundaryTraversal {

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

    // 🔹 Check Leaf
    static boolean isLeaf(Node root) {
        return root.left == null && root.right == null;
    }

    // 🔹 Left Boundary (excluding leaf)
    static void traverseLeft(Node root) {

        if (root == null || isLeaf(root)) return;

        System.out.print(root.data + " ");

        if (root.left != null) {
            traverseLeft(root.left);
        } else {
            traverseLeft(root.right);
        }
    }

    // 🔹 Leaf Nodes
    static void traverseLeaf(Node root) {

        if (root == null) return;

        if (isLeaf(root)) {
            System.out.print(root.data + " ");
            return;
        }

        traverseLeaf(root.left);
        traverseLeaf(root.right);
    }

    // 🔹 Right Boundary (reverse)
    static void traverseRight(Node root) {

        if (root == null || isLeaf(root)) return;

        if (root.right != null) {
            traverseRight(root.right);
        } else {
            traverseRight(root.left);
        }

        // print after recursion (reverse)
        System.out.print(root.data + " ");
    }

    // 🌟 Boundary Traversal
    static void boundary(Node root) {

        if (root == null) return;

        // root
        System.out.print(root.data + " ");

        // left boundary
        traverseLeft(root.left);

        // leaf nodes
        traverseLeaf(root.left);
        traverseLeaf(root.right);

        // right boundary
        traverseRight(root.right);
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

        System.out.println("Boundary Traversal:");
        boundary(root);
    }
}
