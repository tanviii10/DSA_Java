import java.util.HashMap;

class TwoSum {
    static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i < nums.length ; i++){

            int compliment= target - nums[i];

            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment),i};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1,-1};
        
    }

     public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println(result[0] + " " + result[1]);

     }
     
}