import java.util.HashMap;

public class CheckCircularUsingMap {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    static boolean isCircularUsingMap(Node head) {

        HashMap<Node, Boolean> map = new HashMap<>();
        Node temp = head;

        while (temp != null) {

            // If node already visited → loop
            if (map.containsKey(temp)) {
                return true;
            }

            map.put(temp, true);
            temp = temp.next;
        }

        return false; 
    }

    static void makeCircular() {
        if (head == null) return;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
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
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        print();

        System.out.println("Loop present: " + isCircularUsingMap(head));

        makeCircular();

        System.out.println("Loop present: " + isCircularUsingMap(head));
    }
    
}
