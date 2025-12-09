import java.util.Scanner;

public class Factorial_Re {
    public static int calcFactorial(int n){
        if( n==0 || n==1)
        return 1;
        int fact= n * calcFactorial(n-1);
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        System.out.println(calcFactorial(n));
        sc.close();
    }
    
}
