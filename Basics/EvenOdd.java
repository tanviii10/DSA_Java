import java.util.Scanner;

public class EvenOdd {
    
    public static int odd(int n){

        if(n%2==0){
            System.out.println("no is even");
        }
        else{
            System.out.println("no is odd");
        }

        return n;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        odd(n);
        sc.close();
    }
    
}
