import java.util.*;

public class FirstNonRepeatingUsingMap {

     static void firstNonRepeating(String str){

        HashMap<Character, Integer> freq = new HashMap<>();
        Queue<Character> q=new LinkedList<>();

        for(int i=0 ; i< str.length(); i++){
            char ch=str.charAt(i);

            //update freq count
            freq.put(ch, freq.getOrDefault(ch, 0)+1);

            //add to queue
            q.add(ch);

            //remove Repeating
            while( !q.isEmpty() && freq.get(q.peek())>1){
                q.poll();
            }

            if (q.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
     }
     public static void main(String[] args) {

        String str = "aabc";

        firstNonRepeating(str);
    }
    
}
