import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeInWindow {

    static void firstNegative(int arr[], int n, int k){

        Queue<Integer> q=new LinkedList<>();

        for( int i=0 ; i< n ; i++){

            //push index if negative
            if( arr[i] < 0){
                q.add(i);
            }

            //when window size valid
            if( i >= k -1){

                // remove out-of-window elements
                while(!q.isEmpty() && q.peek() < i - k +1){
                    q.poll();
                }

                if(q.isEmpty() ){
                    System.out.print(0+" ");
                }
                else{
                    System.out.print(arr[q.peek()]+" ");
                }
            }
        }
    }
    public static void main(String[] args) {

        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int n = arr.length;
        int k = 3;

        firstNegative(arr, n, k);
    }
    
}
