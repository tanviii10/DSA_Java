import java.util.HashMap;

public class DetectLoop {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;

    static Boolean detectLoop( Node head){

        HashMap<Node, Boolean> map=new HashMap<>();
        Node temp=head;

        while( temp != null){

            if( map.containsKey(temp)){
                return true;
            }

            map.put(temp, true);
            temp=temp.next;
        }

        return false;
    }

    static void print(){
        Node temp=head;

        while( temp != null){
            System.out.println(temp.data+ " ->");
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
