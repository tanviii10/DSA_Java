public class MergeTwoSortedLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node merge(Node first, Node second) {

        // if first list is empty
        if (first == null) return second;

        // if second list is empty
        if (second == null) return first;

        // ensure first list starts with smaller element
        if (first.data > second.data) {
            Node temp = first;
            first = second;
            second = temp;
        }

        Node curr1 = first;
        Node next1 = curr1.next;

        Node curr2 = second;
        Node next2 = curr2.next;

        while (next1 != null && curr2 != null) {

            if (curr2.data >= curr1.data && curr2.data <= next1.data) {

                // insert curr2 between curr1 and next1
                curr1.next = curr2;
                next2 = curr2.next;
                curr2.next = next1;

                // move pointers
                curr1 = curr2;
                curr2 = next2;

            } else {
                // move curr1 and next1 forward
                curr1 = next1;
                next1 = next1.next;

                // if first list ends, attach remaining second list
                if (next1 == null) {
                    curr1.next = curr2;
                    return first;
                }
            }
        }

        return first;
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

        Node first = new Node(1);
        first.next = new Node(3);
        first.next.next = new Node(5);
        first.next.next.next = new Node(7);

        Node second = new Node(2);
        second.next = new Node(4);
        second.next.next = new Node(6);

        print(first);
        print(second);

        Node merged = merge(first, second);
        print(merged);
    }
    
}
