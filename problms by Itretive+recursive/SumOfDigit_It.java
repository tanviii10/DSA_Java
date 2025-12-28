import java.util.Scanner;

public class SumOfDigit_It {

    public static int calcSum(int n){
         
        int sum=0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n /10 ;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println("sum of digit is : "+ calcSum(n));
        sc.close();
    }
}

// sum = 0
// 12345 % 10 = 5 → sum = 5, n = 1234
// 1234 % 10  = 4 → sum = 9, n = 123
// 123 % 10   = 3 → sum = 12, n = 12
// 12 % 10    = 2 → sum = 14, n = 1
// 1 % 10     = 1 → sum = 15, n = 0

