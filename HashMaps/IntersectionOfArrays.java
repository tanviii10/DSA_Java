import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfArrays {

     public static int[] intersect(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>(); // value -> count

        // Count frequencies from arr1
        for (int i = 0; i < arr1.length; i++) {
            int num = arr1[i];
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        // Use list to collect intersection elements
        ArrayList<Integer> list = new ArrayList<>();

        // For each element in arr2, if it exists in map (count > 0), add to result and decrease count
        for (int i = 0; i < arr2.length; i++) {
            int num = arr2[i];
            if (map.containsKey(num) && map.get(num) > 0) {
                list.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        // Convert list to int[]
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1,5,6,3};
        int[] arr2 = {2, 2,3};

        int[] ans = intersect(arr1, arr2);

        // Print result
        System.out.println(Arrays.toString(ans)); 
    }
    
}
