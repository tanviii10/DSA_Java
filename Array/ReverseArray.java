public class ReverseArray {

    static void revArray(int arr[]){

        int left=0;
        int right=arr.length -1;

        while(left < right){
            
            int temp=arr[left];
            arr[left]= arr[right];
            arr[right]= temp;

            left++;
            right --;
        }
    }
     public static void main(String[] args) {
        int arr[]={1,5,4,6,8};

        revArray(arr);

        for(int num : arr){
            System.out.print(num +" ");
        }
     }
    
}
