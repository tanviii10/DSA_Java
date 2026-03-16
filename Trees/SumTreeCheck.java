import java.util.*;

public class SumTreeCheck {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static Scanner sc = new Scanner(System.in);

    static Node buildTree() {

        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        Node root = new Node(data);

        System.out.println("Enter left child of " + data);
        root.left = buildTree();

        System.out.println("Enter right child of " + data);
        root.right = buildTree();

        return root;
    }

    // Function to calculate sum of tree
    static int sum(Node root) {

        if (root == null) {
            return 0;
        }

        return sum(root.left) + sum(root.right) + root.data;
    }

    // Check Sum Tree
    static boolean isSumTree(Node root) {

        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        if (root.data == leftSum + rightSum
                && isSumTree(root.left)
                && isSumTree(root.right)) {

            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("Enter nodes (-1 for NULL)");

        Node root = buildTree();

        if (isSumTree(root)) {
            System.out.println("Tree is a Sum Tree");
        } else {
            System.out.println("Tree is NOT a Sum Tree");
        }
    }
}
/*26
10
4
-1
-1
6
-1
-1
3
-1
3
-1
-1
*/