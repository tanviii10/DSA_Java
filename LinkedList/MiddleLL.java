public class MiddleLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    static Node getMiddle() {

        if (head == null) {
            return null;
        }

        int len = 0;
        Node temp = head;

        //count length
        while (temp != null) {
            len++;
            temp = temp.next;
        }

        //go to middle
        int mid = len / 2;
        temp = head;

        while(mid > 0) {
            temp = temp.next;
            mid--;
        }

        return temp;
    }

    public static void main(String[] args) {

        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        Node middle = getMiddle();
        System.out.println("Middle Node: " + middle.data);
    }
    
}
