public class ReverseArray{
	public static void rev(int arr[]){
		int start=0;
		int end=arr.length-1;
		while(start < end){
			int temp=arr[start];
			arr[start]=arr[end];
            arr[end]=temp;

			start++;
			end--;
		}
    }
	public static void main(String args[]){
		int arr[]={10,20,30,40,50};
		
        rev(arr);
		
		for(int i=0; i< arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
	}
}