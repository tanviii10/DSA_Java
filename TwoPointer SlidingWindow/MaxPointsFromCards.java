public class MaxPointsFromCards {
    public static int maxScore(int[] nums, int k) {

        int n = nums.length;

        int lsum = 0;
        int rsum = 0;
        int maxSum = 0;

        // first k elements from left
        for (int i = 0; i < k; i++) {
            lsum += nums[i];
        }

        maxSum = lsum;

        // Start taking elements from right
        int rightIndex = n - 1;

        for (int i = k - 1; i >= 0; i--) {
            lsum = lsum - nums[i];          // remove from left
            rsum = rsum + nums[rightIndex]; // add from right
            rightIndex--;

            maxSum = Math.max(maxSum, lsum + rsum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;

        System.out.println("Maximum points: " + maxScore(nums, k));
    }
}
