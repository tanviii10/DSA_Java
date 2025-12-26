public class QuickSort {

    public static int partition( int arr[], int start ,int end){

        int pivot=arr[start];

        //1:count elements <= pivot
        int cnt=0;
        for(int i=start+1 ; i<= end; i++){
            if( arr[i] <= pivot){
                cnt++;
            }
        }

        //2:place pivot at correct position
        int pivotIndex= start + cnt;

        int temp= arr[pivotIndex];
        arr[pivotIndex]=arr[start];
        arr[start]=temp;

        //3:fix left and right sides
        int i=start;
        int j=end;

        while(i < pivotIndex && j > pivotIndex){
            while( arr[i] <= pivot){
                i++;
            }
            while (j >= pivot) {
                j--;
            }

            if( i < pivotIndex && j > pivotIndex ){
                int tempo=arr[i];
                arr[i]=arr[j];
                arr[j]=tempo;
            }
        }
        return pivotIndex;
    }

    public static void quickSort(int arr[], int start , int end){

        //base case
        if( start >= end){
            return;
        }

        int p=partition(arr, start , end);

        //left part
        quickSort(arr, start, p-1);

        //right part
        quickSort(arr, p+1, end);
    }

    public static void main(String[] args) {

        int[] arr = {8, 1, 3, 4, 20, 50, 30};

        quickSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
