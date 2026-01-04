public class RemoveDuplicatesSortedLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static void removeDuplicates(){

        if( head == null){
            return;
        }

        Node curr=head;

        while( curr != null && curr.next != null){

            if( curr.data == curr.next.data){
                curr.next=curr.next.next;
            }
            else{
                curr= curr.next;
            }
        }
    }

    public static void main(String[] args) {

        head = new Node(10);
        head.next = new Node(10);
        head.next.next = new Node(20);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(30);

        print();
        removeDuplicates();
        print();
    }
    
}
