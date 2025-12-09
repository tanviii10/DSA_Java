import java.util.Scanner;

public class CountDigit_It {

    public static int count(int n){
        int count=0;
        if( n==0){
            return 1;
        }
        while (n != 0) {
            n = n/10;
            count ++;
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        System.err.println(count(n));
        sc.close();
    }
}

// count = 0
// 12345 → 1234 (count=1)
// 1234  → 123  (count=2)
// 123   → 12   (count=3)
// 12    → 1    (count=4)
// 1     → 0    (count=5)
