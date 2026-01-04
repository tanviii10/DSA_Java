public class StartNodeOfLoop {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    static Node detectLoop(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return slow; 
            }
        }

        return null; 
    }

    static Node getStartNode(Node head) {

        Node intersection = detectLoop(head);

        if (intersection == null) {
            return null;
        }

        Node slow = head;

        while (slow != intersection) {
            slow = slow.next;
            intersection = intersection.next;
        }

        return slow;
    }

    public static void main(String[] args) {

        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        //loop: 50 -> 30
        head.next.next.next.next.next = head.next.next;

        Node start = getStartNode(head);

        if (start != null) {
            System.out.println("Start of loop: " + start.data);
        } else {
            System.out.println("No loop");
        }
    }
}
