public class SinglyLinkedList{

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;

    //insert at head
    static void insertAtHead(int data){
        Node newNode= new Node(data);
        newNode.next=head;
        head=newNode;
    }
    
    //insert at tail
    static void insertAtTail(int data){
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
    }

    // Insert at Position
    static void insertAtPosition(int position, int data) {

        if (position == 1) {
            insertAtHead(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        int count = 1;
        while (count < position - 1 && temp != null) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete Head
    static void deleteAtHead() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    // Delete Tail
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
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Delete by Value
    static void deleteByValue(int value) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != null) {
            if (curr.data == value) {
                prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }

        System.out.println("Value not found");
    }

    //print linked list
    static void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        
        insertAtHead(5);
        print();
        insertAtHead(10);
        print();

        insertAtTail(20);
        insertAtTail(30);
        print();

        insertAtPosition(3, 15);
        print();
    }
}