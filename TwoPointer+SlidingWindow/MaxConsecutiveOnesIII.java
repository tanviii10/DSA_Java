public class MaxConsecutiveOnesIII {

    public static int longestOnes(int[] nums, int k) {

        int left = 0;
        int zeros = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {

            // include right element
            if (nums[right] == 0) {
                zeros++;
            }

            // shrink window if invalid
            while (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }

            // update maximum length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        System.out.println("Max consecutive ones: " + longestOnes(nums, k));
    }
}

