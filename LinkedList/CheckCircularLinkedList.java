public class CheckCircularLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    static boolean isCircular(Node head) {

        if (head == null) {
            return false;
        }

        Node temp = head.next;

        while (temp != null && temp != head) {
            temp = temp.next;
        }

        if( temp == head){
            return true;
        }

        return false;
    }

    static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static void makeCircular() {
        if (head == null) return;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
    }

    public static void main(String[] args) {

        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        print();

        System.out.println("Is Circular: " + isCircular(head));

        makeCircular();

        System.out.println("Is Circular: " + isCircular(head));
    }
    
}
