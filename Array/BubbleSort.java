public class BubbleSort {

    public static void sort(int arr[]){

        int n= arr.length;
        boolean swapped=false;

        for( int i=0 ; i< n-1 ; i++){

            for(int j=0 ; j < n-i -1 ; j++){

                if( arr[j] >= arr[j+1]){

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    swapped = true;
                }
            }

            if( swapped == false){
                break;
            }

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
