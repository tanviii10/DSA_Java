public class PairWithDifference {

    public static boolean isPairExist(int arr[],int target){

        int i=0;
        int j=1;

        while(i < arr.length && j < arr.length){
            
            if (i != j && arr[j] - arr[i] == target) {
                return true;
            }
            else if (arr[j] - arr[i] < target) {
                j++;
            }
            else {
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 8, 10};
        int k = 3;

        System.out.println("Pair exists: " + isPairExist(arr, k));
    }
    
}
