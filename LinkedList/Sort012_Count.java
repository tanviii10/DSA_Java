public class Sort012_Count {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    static void sort012(){

        int zeroCount=0, oneCount=0, twoCount=0;
        Node temp=head;

        while( temp != null){

            if( temp.data == 0) 
                zeroCount++;
            else if( temp.data == 1) 
                oneCount++;
            else 
                twoCount++;

            temp=temp.next;
        }

        temp=head;
        while( temp != null){

            if( zeroCount != 0){
                temp.data=0;
                zeroCount--;
            }
            else if( oneCount != 0){
                temp.data=1;
                oneCount--;
            }
            else if( twoCount != 0){
                temp.data=2;
                twoCount--;
            }
            temp=temp.next;
        }
    }

    static void print() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " -> ");
            t = t.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        head = new Node(1);
        head.next = new Node(0);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(0);

        print();
        sort012();
        print();
    }
    
}
