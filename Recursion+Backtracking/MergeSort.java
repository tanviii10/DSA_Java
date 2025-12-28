public class MergeSort {

    public static void merge(int arr[], int start, int mid, int end){

        int n1=mid - start + 1;
        int n2 = end - mid;

        int startArr[]=new int[n1];
        int endArr[]=new int[n2];

        //copy both array
        for( int i=0; i<n1 ; i++){
            startArr[i]=arr[start + i];
        }
        for( int j=0 ; j< n2 ; j++){
            endArr[j]=arr[mid + 1 + j ];
        }

        int i=0 , j=0 , k=start;

        //merge two array
        while( i < n1 && j < n2){
            if(startArr[i] <= endArr[j]){
                arr[k]=startArr[i];
                k++;
                i++;
            }
            else{
                arr[k]=endArr[j];
                k++;
                j++;
            }
        }

        //copy remaining element
        while(i < n1){
            arr[k]=startArr[i];
            i++;
            k++;
        }
        while( j < n2){
            arr[k]=endArr[j];
            j++;
            k++;
        }
    }

    public static void mergSort( int arr[], int start,int end){

        //base case
        if( start >= end){
            return ;
        }

        int mid= start + (end - start)/2;

        //left part
        mergSort(arr, start, mid );

        //right part
        mergSort(arr, mid+1, end);

        //merge two sorted array
        merge(arr, start, mid, end);
    }

    public static void main(String[] args) {

        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        mergSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
