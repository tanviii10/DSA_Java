public class PairSum {

    public static void findSum(int arr[] , int target){

        for(int i=0 ; i< arr.length ; i++){
            for( int j=i+1 ; j< arr.length ; j++){

                if( arr[i] + arr[j] == target){
                    System.out.println(arr[i] +"+"+ arr[j] +"="+ target);
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[]={ 3 ,5,2,4,6,1,8};

        findSum(arr, 9 );
    }
    
}
