public class RemoveDuplicateFromSorted {

    public static int remove(int arr[]){

        int i=0;

        for(int j=1 ; j<arr.length ; j++){
            if( arr[j] != arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        
        int[] arr = {1, 1, 2, 2, 3,4,4,4,5};

        int len = remove(arr);

        for (int k = 0; k < len; k++) {
            System.out.print(arr[k] + " ");
        }
        
    }
}
