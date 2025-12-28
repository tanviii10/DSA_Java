import java.util.Scanner;

public class CountDigit_Re {

    public static int count( int n){
        if( n == 0){
            return 0;
        }
        int ans = 1 + count(n / 10);
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        System.err.println(count(n));
        sc.close();
    }

}

// count(12345) = 1 + count(1234)
// count(1234)  = 1 + count(123)
// count(123)   = 1 + count(12)
// count(12)    = 1 + count(1)
// count(1)     = 1 + count(0)
// count(0)     = 0  (base case)
// Backtrack: 1+1+1+1+1 = 5
