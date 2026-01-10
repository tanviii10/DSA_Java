import java.util.Deque;
import java.util.LinkedList;

public class OutputRestrictedQueue {

    public static void main(String[] args) {

        Deque<Integer> dq = new LinkedList<>();

        // insertion at both ends
        dq.addFirst(20);
        dq.addLast(30);
        dq.addFirst(10);
        dq.addLast(40);

        System.out.println("Queue after insertions: " + dq);

        // deletion allowed only from front
        System.out.println("Deleted from front: " + dq.removeFirst());

        System.out.println("Final Queue: " + dq);
    }
    
}
