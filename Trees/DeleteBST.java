public class DeleteBST{
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Insert
    static Node insert(Node root, int data) {

        if (root == null) return new Node(data);

        if (data < root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);

        return root;
    }

    // Find minimum (used in delete)
    static Node minValue(Node root) {
        Node temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp;
    }

    // 🌟 Delete function
    static Node deleteNode(Node root, int key) {

        if (root == null) return null;

        // find node
        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        }
        else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        }
        else {
            // NODE FOUND

            // Case 1: 0 child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: 1 child
            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }

            // Case 3: 2 children
            Node min = minValue(root.right);
            root.data = min.data;
            root.right = deleteNode(root.right, min.data);
        }

        return root;
    }

    // Inorder (to check result)
    static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        int[] arr = {50, 30, 70, 20, 40, 60, 80};

        Node root = null;

        for (int i = 0; i < arr.length; i++) {
            root = insert(root, arr[i]);
        }

        System.out.println("Before Deletion:");
        inorder(root);

        root = deleteNode(root, 50);  // delete root

        System.out.println("\nAfter Deletion:");
        inorder(root);
    }
}