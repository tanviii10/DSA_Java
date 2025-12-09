public class Largestele {

    static int findLargest(int arr[]){

        int largest=0;
        for(int i=0 ; i< arr.length ;i++){
            if(arr[i]> largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    
    public static void main(String[] args) {
        int arr[]={2, 6, 4, 3, 8,5};

        System.out.println(findLargest(arr));
    }
}
