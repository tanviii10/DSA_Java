public class FirstLastOccerence {

    public static int firstOccrence(int arr[], int key){

        int start= 0;
        int end = arr.length-1;

        int mid= start + (end - start)/2;
        int ans = -1;

        while(start <= end){

            if( arr[mid] == key){
                ans = mid;
                end = mid -1;
            }
            else if( key > arr[mid]){
                start =  mid + 1;
            }
            else{
                end= mid -1;
            }

            mid= start + (end - start)/2;
        }
        return ans;
    }

    public static int lastOccrence(int arr[], int key){

        int start= 0;
        int end = arr.length-1;

        int mid= start + (end - start)/2;
        int ans=-1;

        while(start <= end){

            if( arr[mid] == key){
                ans= mid;
                start =  mid + 1;
            }
            else if( key > arr[mid]){
                start =  mid + 1;
            }
            else{
                end= mid -1;
            }

            mid= start + (end - start)/2;
        }
        return ans;
    }

    //total no of Occrence
    // lastOccrence - firstOccrence + 1 

    public static void main(String[] args) {
        
        int arr[]={2,3,4,5,5,5,5,5,7,8,9};

        System.out.println("first Occrence of key at index : "+ firstOccrence(arr, 5));
        System.out.println("last Occrence of key at index : "+ lastOccrence(arr, 5));
    }
    
}
