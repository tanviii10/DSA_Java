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
 
    public static Node reverse(Node curr, Node prev) {

        // Base case
        if (curr == null) {
            return prev;
        }

        Node forward = curr.next;
        curr.next = prev;

        return reverse(forward, curr);
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
        
        head=reverse(head, null);
        print();
    }
    
}
