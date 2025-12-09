public class pairSum {

    public static void getPair(int arr[] , int target){

        for(int i=0 ; i < arr.length ; i++){
            for( int j=i+1 ; j< arr.length ; j++){

                if( arr[i] + arr[j] == target){
                    System.out.println( arr[i]+ " + "+ arr[j] + " = "+ target);
                }
            }
        }
    }
    public static void main(String[] args) {
        
        int arr[]={2, 6,8,4,3,5,2,3,5,6,10};

        getPair(arr, 10);
    }

    // two pointer approach

    // public static void pairSum(int[] arr, int target) {

    //     Arrays.sort(arr);

    //     int i = 0;
    //     int j = arr.length - 1;

    //     while (i < j) {

    //         int sum = arr[i] + arr[j];

    //         if (sum == target) {
    //             System.out.println(arr[i] + " + " + arr[j] + " = " + target);
    //             i++;
    //             j--;
    //         }
    //         else if (sum < target) {
    //             i++;
    //         }
    //         else {
    //             j--;
    //         }
    //     }
    // }
    
}
