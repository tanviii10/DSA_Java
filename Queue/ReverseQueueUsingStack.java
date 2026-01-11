import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueueUsingStack {

    static void reverseQueue( Queue<Integer> q){
        
        Stack<Integer> st=new Stack<>();

        while (!q.isEmpty()) {
            int ele=q.poll();
            st.push(ele);
        }

        while(!st.isEmpty()){
            int ele=st.pop();
            q.add(ele);
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();

        q.add(12);
        q.add(3);
        q.add(15);
        q.add(20);

        System.out.println(q);

        reverseQueue(q);

        System.out.println(q);
    }
}
