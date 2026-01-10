import java.util.Deque;
import java.util.LinkedList;

public class DequeOperations {

    public static void main(String[] args) {

        Deque<Integer> dq = new LinkedList<>();

        dq.addFirst(10);     // insert at front
        dq.addLast(20);      // insert at rear
        dq.offerFirst(5);    // safe insert at front
        dq.offerLast(30);    // safe insert at rear

        System.out.println("Deque after insertions: " + dq);

        //Access Operation
        System.out.println("Front element: " + dq.peekFirst());
        System.out.println("Rear element: " + dq.peekLast());

        //Deletion Operation
        System.out.println("Removed from front: " + dq.removeFirst());
        System.out.println("Removed from rear: " + dq.removeLast());

        System.out.println("Deque after deletions: " + dq);

        //Utility Operations 
        System.out.println("Size of deque: " + dq.size());
        System.out.println("Is deque empty? " + dq.isEmpty());
    }
    
}
