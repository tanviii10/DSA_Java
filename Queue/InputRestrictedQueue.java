import java.util.Deque;
import java.util.LinkedList;

public class InputRestrictedQueue {

    public static void main(String[] args) {

        Deque<Integer> dq = new LinkedList<>();

        // insertion allowed only at rear
        dq.addLast(10);
        dq.addLast(20);
        dq.addLast(30);

        System.out.println("Queue after insertions: " + dq);

        // deletion from front
        System.out.println("Deleted from front: " + dq.removeFirst());

        // deletion from rear
        System.out.println("Deleted from rear: " + dq.removeLast());

        System.out.println("Final Queue: " + dq);
    }
    
}
