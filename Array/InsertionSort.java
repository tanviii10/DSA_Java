public class InsertionSort{

    public static void sort( int arr[]){

        for(int i=1 ;i < arr.length ; i++){

            int key = arr[i];
            int j= i-1;

            while( j >= 0 && arr[j] > key){

                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {
        
        int arr[]={ 23,34,45,5,66,12,34,78,90};

        sort(arr);

        System.out.println("sorted array is : ");
        for( int i : arr){
            System.out.print(i+ " ");
        }
    }
}