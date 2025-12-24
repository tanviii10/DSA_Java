import java.util.Scanner;

public class Factorial {
    
    public static int fact(int n){

        if(n == 0 ){
            return 1;
        }

        int choti=fact(n-1);
        int badi = n * choti;

        return badi;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("enter a number: ");
        int n=sc.nextInt();

        System.out.println("factorial of "+ n+ " is "+ fact(n));
    }
}
