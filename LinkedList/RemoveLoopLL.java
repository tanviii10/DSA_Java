public class RemoveLoopLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    // STEP 1
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

    // STEP 2
    static Node getStartNode(Node head, Node intersection) {
        if (intersection == null) return null;

        Node slow = head;

        while (slow != intersection) {
            slow = slow.next;
            intersection = intersection.next;
        }
        return slow;
    }

    // STEP 3
    static void removeLoop(Node startNode) {
        if (startNode == null) return;

        Node temp = startNode;
        while (temp.next != startNode) {
            temp = temp.next;
        }
        temp.next = null;
    }

    static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        //loop: 50 -> 30
        head.next.next.next.next.next = head.next.next;

        Node intersection = detectLoop(head); 
        
        Node startNode = getStartNode(head, intersection);
         if (startNode != null) {
            System.out.println("Start of loop: " + startNode.data);
        } else {
            System.out.println("No loop");
        }

        removeLoop(startNode);                       

        print();
    }
    
}
