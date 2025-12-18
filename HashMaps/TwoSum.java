import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int arr[],int target){

        HashMap<Integer ,Integer> map=new HashMap<>();
        
        for( int i=0; i< arr.length ;i++){
            int num= arr[i];
            int complimet=target- num;

            if (map.containsKey(complimet)) {
                return new int[] { map.get(complimet), i };
            }

            map.put(num, i);
        }

        return new int[] { -1,-1};
    }
    public static void main(String[] args) {
        
        int[] nums = {4, 3, 5, 1};
        int target = 8;

        int[] ans = twoSum(nums, target);
        System.out.println("Indices: " + Arrays.toString(ans));
    }
    
}
