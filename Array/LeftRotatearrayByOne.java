public class LeftRotatearrayByOne{

    static int[] rotateArray(int arr[]){
        int temp= arr[0];

        for(int i=1 ; i < arr.length ;i++){
            arr[i-1]=arr[i];

        }
        arr[arr.length-1]=temp;
        return arr;
    }
    
    public static void main(String[] args) {
        int arr[]={1,45,7,8,3,9};
        int rotatedArr[] = rotateArray(arr);
        
       for (int i = 0; i < rotatedArr.length; i++) {
            System.out.print(rotatedArr[i] + " ");
        }
    }
}
