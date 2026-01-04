import java.util.HashSet;

public class RemoveDuplicatesUnsortedLoop {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    static void removeDuplicates() {

        if (head == null) return;

        HashSet<Integer> set = new HashSet<>();
        Node curr = head;
        Node prev = null;

        while (curr != null) {

            if (set.contains(curr.data)) {
                prev.next = curr.next;
            } else {
                set.add(curr.data);
                prev = curr;
            }

            curr = curr.next;
        }
    }

    static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(10);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(20);

        print();
        removeDuplicates();
        print();
    }
    
}
