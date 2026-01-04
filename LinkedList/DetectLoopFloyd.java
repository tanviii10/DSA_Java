public class DetectLoopFloyd {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;

    static boolean detectLoop(Node head){

        if( head== null){
            return false;
        }

        Node fast=head;
        Node slow=head;

        while ( fast != null && fast.next !=null) {
            
            slow=slow.next;
            fast=fast.next.next;

            if( slow == fast){
                return true;
            }
        }

        return false;
    }

    static void Print(){

        Node temp=head;
        while( temp != null){
            System.out.println(temp.data+ " -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        //loop: 40 -> 20
        head.next.next.next.next = head.next;

        System.out.println("Loop Present: " + detectLoop(head));
    }
    
}
