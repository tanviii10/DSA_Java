public class MinMax {
    
    public static int get_min(int arr[]){
        int min =arr[0];

        for(int i=0 ; i< arr.length ; i++){
            if( arr[i] < min){
                min= arr[i];
            }
        }
        return min;
    }
    public static int get_max(int arr[]){
        int max=arr[0];
        for(int i=0 ; i< arr.length ; i++){
            if(arr[i] > max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){

        int arr[]={34,5,6,8,23,10};

        System.out.println("max ele in array is:"+ get_max(arr));
        System.out.println("min ele in array is:"+get_min(arr));
    }
}
