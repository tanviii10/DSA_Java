public class IsSorted {

    public static boolean isSorted(int arr[],int index){

        if( index == arr.length -1){
            return true;
        }

        if(arr[index] > arr[index+1]){
            return false;
        }
        
        return isSorted(arr, index+1);
        
    }
    public static void main(String[] args) {
        int arr[]={ 2,5,6,7,8,5};

        System.out.println("isSorted ? "+ isSorted(arr,0));

    }
    
}
