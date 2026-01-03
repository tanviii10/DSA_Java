public class ReverseLLBYKgroup {

    static class Node{
        int data;
        Node next;

        Node( int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;

    static Node reverseKgroups(Node head, int k){

        if( head == null){
            return null;
        }

        Node curr=head;
        Node prev=null;
        Node next=null;

        int count=0;
        while( curr != null && count < k ){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count ++;
        }

        if( next != null ){
            head.next=reverseKgroups(next, k);
        }

        return prev;
    }

    static void print(){
        Node temp= head;
        while( temp != null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        print();

        int k = 3;
        head = reverseKgroups(head, k);

        print();
        
    }
    
}
