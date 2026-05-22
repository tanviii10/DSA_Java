import java.util.*;

public class EvenOdd{
    
    public static void evenOdd(int n){

        if(n % 2== 0){
            System.out.println("no. is even");
        }
        else{
            System.out.println("no. is odd");
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        evenOdd(n);
    }
}