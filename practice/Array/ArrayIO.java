import java.util.Scanner;
public class ArrayIO {
    public static void inputArray(int arr[], int n){
        Scanner sc=new Scanner(System.in);

        for( int i=0; i<n ; i++){
            arr[i]=sc.nextInt();
        }
    }
    public static void print(int arr[]){
        for(int i=0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
       int n=5;
       int arr[]=new int[n];

       inputArray(arr,n);
       print(arr);
    }
}
