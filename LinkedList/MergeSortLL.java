public class MergeSortLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Find middle
    static Node getMiddle(Node head) {

        if (head == null) return head;

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    //Merge two sorted linked lists
    static Node merge(Node left, Node right) {

        if (left == null) return right;
        if (right == null) return left;

        Node result;

        if (left.data <= right.data) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }

        return result;
    }

    //Merge Sort
    static Node mergeSort(Node head) {

        // base case
        if (head == null || head.next == null) {
            return head;
        }

        // find middle
        Node mid = getMiddle(head);

        Node right = mid.next;
        mid.next = null;

        Node left = head;

        // recursive sort
        left = mergeSort(left);
        right = mergeSort(right);

        // merge
        return merge(left, right);
    }

    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(5);

        print(head);

        head = mergeSort(head);

        print(head);
    }
    
}
