public class ReverseLL3 {

    public static class  Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static Node head=null;

    static Node reverse(Node head){

        if( head == null || head.next == null){
            return head;
        }

        Node newHead = reverse(head.next);

        head.next.next=head;
        head.next=null;

        return newHead;
    }

    static void print(){
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

        head = reverse(head);
        print();
    }
    
}
