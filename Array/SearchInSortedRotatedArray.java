public class SearchInSortedRotatedArray {

    public static int pivot(int arr[]){

        int s = 0;
        int e = arr.length-1;
        int mid=s + (e -s )/2;

        while( s < e ){

            if( arr[mid] >= arr[0]){
                s = mid + 1;
            }
            else {
                e = mid;
            }
            mid=s + (e -s )/2;
        }
        return s;

    }

    public static int binarySearch(int arr[], int s,int e,int key){

        int start=s;
        int end= e;

        int mid= start + (end - start)/2;

        while(start <= end){

            if(arr[mid]== key ){
                return mid;
            }

            if(key > arr[mid]){
                start = mid +1;
            }
            else{
                end= mid-1;
            }

            mid= start + (end - start)/2;
        }
        return -1;
    }

    public static int searchSRA(int arr[], int key){

        int pivotele= pivot(arr);

        if( key >= pivotele && key < arr.length ){
            return binarySearch(arr, pivotele, arr.length-1,key);
        }
        else{
           return binarySearch(arr, 0,pivotele-1, key);
        }
    }

    public static void main(String[] args) {
        
        int arr[]={ 7,9,1,3,4,5};

        System.out.println("elemet present at index : "+searchSRA(arr, 9));
    }
    
}
