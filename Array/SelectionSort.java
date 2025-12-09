public class SelectionSort {

    public static void sort( int arr[]){

        for( int i = 0 ; i < arr.length-1 ; i++){
            int minIndex=i;

            for( int j= i+1 ; j < arr.length ; j++){

                if( arr[j] < arr[minIndex])
                    minIndex= j;
            }
        
            int temp = arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        
    }

    public static void main(String[] args) {
        
        int arr[]={ 23,34,45,5,66,12,35,78,90};

        sort(arr);

        System.out.println("sorted array is : ");
        for( int i : arr){
            System.out.print(i+ " ");
        }
    }
    
}
