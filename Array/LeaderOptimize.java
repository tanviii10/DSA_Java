import java.util.ArrayList;
import java.util.Collections;

public class LeaderOptimize {

     static ArrayList<Integer> leader(int arr[]){
        ArrayList<Integer> result=new ArrayList<>();

        int n=arr.length;
        int maxRight=arr[n-1];

        if (n == 0) return result;

        result.add(maxRight);

        for(int i= n -2 ; i >=0 ; i--){
            if(arr[i] >= maxRight){
                 maxRight = arr[i];
                 result.add(maxRight);

            }
        }

        Collections.reverse(result);

        return result;
     }

     public static void main(String[] args) {

        int arr[]={2 ,4, 67, 5, 6, 7, 5 ,3,4,1};
        ArrayList<Integer> result=leader(arr);

        for(int res : result){
            System.out.println(res);
        }
     }
    
}
