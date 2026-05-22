public class SwapAlternates {
    public static void swap(int arr[]){

        for(int i=0 ; i < arr.length-1 ; i=i+2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    public static void main(String args[]){
        int arr[]={12,5,8,9,23,2,7};

        swap(arr);

        for(int i=0; i< arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
