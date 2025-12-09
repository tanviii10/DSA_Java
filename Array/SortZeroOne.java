public class SortZeroOne {

    public static void sort(int arr[]){

        int left=0;
        int right= arr.length -1;

        while( left < right ){

            if(arr[left] == 0){
                left ++;
            }
            else if(arr[right] == 1){
                right--;

            }
            else{

                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
    }

    public static void main(String[] args) {
        
        int arr[]={ 1,1,0,1,0,1,0,0,0,1,1,1};

        sort(arr);

        for(int i : arr){
            System.out.print(i+ " ");
        }
    }
    
}
