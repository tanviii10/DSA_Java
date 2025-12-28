public class LinearSearch {

    public static boolean linearSearch(int arr[],int index,int key){

        if( index == arr.length)
            return false;

        if(arr[index] == key){
            return true;
        }
        else{
            boolean res= linearSearch(arr, index+1, key);
            return res;
        }
    }
    public static void main(String[] args) {
        int arr[]={ 2,5,7,9,4,6};

        int key=12;

        System.out.println("is "+ key + " present "+ linearSearch(arr, 0, key));
    }
    
}
