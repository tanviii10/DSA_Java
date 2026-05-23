public class CheckSorted {
    public static boolean isSorted(int arr[]){
        for(int i=0 ; i < arr.length-1 ;i++){
            if( arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
		int arr[]={10,20,30,40,50};
		
		isSorted(arr);
        System.out.println(isSorted(arr));
	}
}
