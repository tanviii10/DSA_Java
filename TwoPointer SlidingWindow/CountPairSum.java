public class CountPairSum {
    public static int countPairs(int[] arr, int sum) {

        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while (left < right) {

            int currSum = arr[left] + arr[right];

            if (currSum == sum) {
                count++;

                int leftVal = arr[left];
                int rightVal = arr[right];

                // skip duplicates on left
                while (left < right && arr[left] == leftVal) {
                    left++;
                }

                // skip duplicates on right
                while (left < right && arr[right] == rightVal) {
                    right--;
                }
            }
            else if (currSum < sum) {
                left++;
            }
            else {
                right--;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        
        int[] arr = {1, 1, 2, 3, 4, 4, 5};
        int sum = 6;

        System.out.println("Count of pairs: " + countPairs(arr, sum));

    }
    
}
