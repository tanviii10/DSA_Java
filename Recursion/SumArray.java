public class SumArray {

    public static int sumArray(int arr[], int index){

        if( index == arr.length)
            return 0;

        return arr[index]+ sumArray(arr, index + 1);
    }

    public static void main(String[] args) {
        int arr[]={2,4,6,8};

        System.out.println("sum of array is : "+ sumArray(arr, 0));
    }
    
}
