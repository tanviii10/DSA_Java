public class ReverseLL1 {

    public static class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public static Node head=null;

    public static void reverse(){
        Node prev=null;
        Node curr=head;
        Node forward=null;

        while( curr != null ){
            forward = curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        head = prev;
    }

    static void print(){
        Node temp=head;
        while( temp != null){
            System.out.print(temp.data+ " -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        
        print();
        reverse();
        print();
    }
}
