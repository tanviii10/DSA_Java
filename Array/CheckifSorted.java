public class CheckifSorted {

    static boolean checkSorted(int arr[]){

       int n=arr.length;

       if(n==0 || n ==1){
        return true;
       }

       for( int i=1 ; i < n ; i++){
            if( arr[i-1] > arr[i]){
                return false;
            }
       }
       return true;
    }

    public static void main(String[] args) {
        int arr[]={2,5,6,8,1};

        System.out.println(checkSorted(arr));
    }
    
}
