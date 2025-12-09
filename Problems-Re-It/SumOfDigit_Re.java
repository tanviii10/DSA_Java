import java.util.Scanner;

public class SumOfDigit_Re {

    public static int calcSum(int n){
        if( n == 0){
            return 0;
        }

        int ans= ( n % 10) + calcSum( n / 10);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println("sum of digit is : "+ calcSum(n));
        sc.close();
    }
}

// sum(12345) = 5 + sum(1234)
// sum(1234)  = 4 + sum(123)
// sum(123)   = 3 + sum(12)
// sum(12)    = 2 + sum(1)
// sum(1)     = 1 + sum(0)
// sum(0)     = 0
// Backtrack: 5+4+3+2+1 = 15

