import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InterleaveQueue {

    static void interleaveQueue(Queue<Integer> q) {

        int n = q.size();

        if (n % 2 != 0) {
            System.out.println("Queue size must be even");
            return;
        }

        Stack<Integer> st = new Stack<>();

        //first half - stack
        for (int i = 0; i < n / 2; i++) {
            st.push(q.poll());
        }

        //stack - queue
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        //move first half to back
        for (int i = 0; i < n / 2; i++) {
            q.add(q.poll());
        }

        //again first half - stack
        for (int i = 0; i < n / 2; i++) {
            st.push(q.poll());
        }

        //mix
        while (!st.isEmpty()) {
            q.add(st.pop());
            q.add(q.poll());
        }
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        System.out.println(q);

        interleaveQueue(q);

        System.out.println(q);
    }
    
}
