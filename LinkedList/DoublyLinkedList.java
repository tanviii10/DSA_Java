public class DoublyLinkedList {

    // Node class
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    static Node head = null;

    // Insert at Head
    static void insertAtHead(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Insert at Tail
    static void insertAtTail(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Insert at Position (1-based)
    static void insertAtPosition(int position, int data) {

        if (position == 1) {
            insertAtHead(data);
            return;
        }

        Node temp = head;
        int count = 1;

        while (count < position - 1 && temp != null) {
            temp = temp.next;
            count++;
        }

        if (temp == null || temp.next == null) {
            insertAtTail(data);
            return;
        }

        Node newNode = new Node(data);

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // Delete at Head
    static void deleteAtHead() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    // Delete at Tail
    static void deleteAtTail() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
    }

    // Delete by Value
    static void deleteByValue(int value) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data == value) {
            deleteAtHead();
            return;
        }

        Node temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value not found");
            return;
        }

        if (temp.next == null) {
            deleteAtTail();
            return;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    // Print Forward
    static void printForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main Method
    public static void main(String[] args) {

        insertAtHead(10);
        insertAtHead(5);
        printForward();

        insertAtTail(20);
        insertAtTail(30);
        printForward();

        insertAtPosition(3, 15);
        printForward();

        deleteAtHead();
        printForward();

        deleteAtTail();
        printForward();

        deleteByValue(15);
        printForward();
    }
    
}
