public class PivotInArray {

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

    public static void main(String[] args) {
        
        int arr[]={4,12,1,2,3,4};

        System.out.println("pivot is at index : "+pivot(arr));
    }
    
}
