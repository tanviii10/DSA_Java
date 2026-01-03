public class ReverseLLrecursive {

    public static class  Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static Node head=null;

    public static void reverse(Node head, Node curr, Node prev){

        if( curr == null){
            head=prev;
            return;
        }

        Node forward=curr.next;
        reverse(head, forward, curr);
        curr.next=prev;
    }

    public static void print(){

        Node temp=head;
        while( temp != null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        print();
        
        
    }
    
}
