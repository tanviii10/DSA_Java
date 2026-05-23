public class LinearSearch {
    public static void search(int arr[],int key){
        for(int i=0 ; i< arr.length ;i++){
            if(arr[i] == key){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
		int arr[]={10,20,30,40,50};
		
		search(arr,30);
	}
}
