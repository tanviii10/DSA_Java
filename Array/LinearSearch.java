import java.util.Scanner;

public class LinearSearch {

    public static boolean search(int arr[] , int key){
        
        for(int i=0 ; i < arr.length ; i++){
            if( arr[i] == key){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         
        int arr[]={2,5,8,9,45,3,2};
        int key=sc.nextInt();

        System.out.println("the selectec key : "+ key + search(arr, key));
        sc.close();
    }
    
    
    // // Function to return index of first occurrence
    // public static int linearSearch(int[] arr, int x) {

    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] == x) {   // first match
    //             return i;
    //         }
    //     }

    //     return -1;  // not found
    // }

}
