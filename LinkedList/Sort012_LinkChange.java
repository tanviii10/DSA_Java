public class Sort012_LinkChange {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    static Node sortList(Node head) {

        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);

        Node zeroTail = zeroHead;
        Node oneTail = oneHead;
        Node twoTail = twoHead;

        Node curr = head;

        //Divide list into 3 lists
        while (curr != null) {

            if (curr.data == 0) {
                zeroTail.next = curr;
                zeroTail = curr;
            } else if (curr.data == 1) {
                oneTail.next = curr;
                oneTail = curr;
            } else {
                twoTail.next = curr;
                twoTail = curr;
            }

            curr = curr.next;
        }

        // Step 2: Merge lists
        if (oneHead.next != null) {
            zeroTail.next = oneHead.next;
        } else {
            zeroTail.next = twoHead.next;
        }

        // connect 1s list with 2s list
        oneTail.next = twoHead.next;

        // end of list
        twoTail.next = null;

        // new head
        return zeroHead.next;
    }

    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        head = new Node(1);
        head.next = new Node(0);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(0);
        head.next.next.next.next.next = new Node(2);

        print(head);

        head = sortList(head);

        print(head);
    }
}
