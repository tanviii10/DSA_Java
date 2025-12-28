public class BinarySearch {

    public static boolean binarySearch( int arr[], int s, int e,int key){

        if( s > e)
            return false;

         int mid= s + (e-s)/2;

        if(arr[mid]== key)
            return true;

        if( arr[mid] < key){
            return binarySearch(arr, mid+1, e, key);
        }
        else{
            return binarySearch(arr, s, mid-1, key);
        }
    }
    public static void main(String[] args) {
        
        int arr[]={ 2,5,6,8,10};
        int key=13;

        System.out.println("is elemnt present :"+ binarySearch(arr, 0, arr.length-1, key));
    }
    
}
