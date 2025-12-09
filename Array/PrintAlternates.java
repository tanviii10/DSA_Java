import java.util.ArrayList;
import java.util.Scanner;

public class PrintAlternates {

    public static ArrayList<Integer> getAlternets(int arr[]){

        ArrayList<Integer> res= new ArrayList<>();
        
        for(int i=0 ; i < arr.length ; i +=2){
            res.add(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();
        int[] arr = new int[n];

       for( int i=0 ; i < n ;i++){
            arr[i] = sc.nextInt();
       }

        
        ArrayList<Integer> result = getAlternets(arr);

        
        for (int num : result) {
            System.out.print(num + " ");
        }
        sc.close();
    }
    
}

