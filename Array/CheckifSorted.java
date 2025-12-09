public class CheckifSorted {

    static boolean checkSorted(int arr[]){

        for( int i=1 ; i < arr.length ; i++){
            if(arr[i] >= arr[i-1]){
                
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[]={2,5,6,8};

        System.out.println(checkSorted(arr));
    }
    
}
