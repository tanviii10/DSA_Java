import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstK {

    static void reverse( Queue<Integer> q , int k){

        if( q.isEmpty() || k <= 0 || k> q.size()){
            return;
        }

        Stack<Integer> st=new Stack<>();

        for( int i=0 ; i< k ; i++){
            int ele=q.poll();
            st.push(ele); 
        }

        while (!st.isEmpty()) {
            int ele=st.pop();
            q.add(ele);
        }

        int remaining=q.size()-k;
        for( int i=0 ; i< remaining ; i++){
            int ele=q.poll();
            q.add(ele);
        }
    }
    public static void main(String[] args) {
        
        Queue<Integer> q=new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println(q);

        int k = 3;
        reverse(q, k);

        System.out.println(q);
    }
}
