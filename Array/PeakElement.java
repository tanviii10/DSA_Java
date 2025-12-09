public class PeakElement {

    public static int findPeak(int arr[]){

        int start= 0;
        int end= arr.length-1;

        int mid= start + ( end - start)/2;

        while( start < end){

            if( arr[mid] < arr[ mid + 1 ]){
                start = mid +1 ;
            }
            else{
                end = mid;
            }
            mid= start + ( end - start)/2;
        }
        return start;
    }

    public static void main(String[] args) {
        
        int arr[]={2,3,5,1};

        System.out.println("peak elemet's index is : "+ findPeak(arr));
    }
    
}
