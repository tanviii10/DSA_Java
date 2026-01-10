import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {

    public static void main(String[] args) {

        // Create Queue
        Queue<Integer> q = new LinkedList<>();

        // Enqueue (Insertion)
        q.add(10);
        q.add(20);
        q.add(30);
        q.offer(40);

        System.out.println("Queue after insertion: " + q);

        // Dequeue (Deletion)
        int removed = q.remove();
        System.out.println("Removed element: " + removed);

        // Peek (Front element)
        System.out.println("Front element: " + q.peek());

        // Size
        System.out.println("Queue size: " + q.size());

        // Check empty
        System.out.println("Is queue empty? " + q.isEmpty());

        // Traversing queue
        System.out.print("Queue elements: ");
        for (int i = 0; i < q.size(); i++) {
            System.out.print(q.poll() + " ");
        }

        System.out.println("\nIs queue empty now? " + q.isEmpty());
    }
}
