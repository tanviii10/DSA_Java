import java.util.Scanner;

public class LinearSearch{

    public static int search(int arr[], int key){

        for(int i=0 ; i < arr.length ; i++){
            if( arr[i] == key ){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int arr[]={ 12, 6,8,34,2};
        int key=sc.nextInt();
        
        System.out.println("ele present at index "+search(arr,key));

    }
}