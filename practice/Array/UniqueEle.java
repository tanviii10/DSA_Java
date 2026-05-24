public class UniqueEle {
    public static int findUnique(int arr[]){
        int ans=0;
        for( int i=0 ; i < arr.length ; i++){
            ans= ans ^ arr[i];
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[]={ 2,3,4,3,2,};

        System.out.println(findUnique(arr));
    }
}
