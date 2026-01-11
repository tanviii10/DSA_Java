import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueueUsingRecursion {

    static void reverseQueue(Queue<Integer> q){

        if(q.isEmpty()){
            return;
        }

        //remove first ele
        int front=q.poll();

        reverseQueue(q);

        //add back 
        q.add(front);
    }
    public static void main(String[] args) {
        
        Queue<Integer> q=new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q);

        reverseQueue(q);

        System.err.println(q);
    }
}
