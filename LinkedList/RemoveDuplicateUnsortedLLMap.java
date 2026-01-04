import java.util.HashMap;

public class RemoveDuplicateUnsortedLLMap {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    static void removeDuplicates(){

        HashMap<Integer,Boolean> visited=new HashMap<>();
        Node curr=head;
        Node prev=null;

        while( curr != null){

            if( visited.containsKey(curr.data)){
                prev.next=curr.next;
            }
            else{
                visited.put(curr.data, true);
                prev= curr;
            }
            curr=curr.next;
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
