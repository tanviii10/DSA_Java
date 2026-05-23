public class SwapAlternate {
    public static void swap(int arr[]){
        for( int i=0 ; i < arr.length-1; i=i+2){
            if( arr[i+1] != 0){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
    public static void main(String args[]){
		int arr[]={10,20,30,40,50};
		
		swap(arr);
        for(int i=0; i< arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
	}
}
