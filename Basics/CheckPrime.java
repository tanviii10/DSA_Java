import java.util.Scanner;

public class CheckPrime {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean isPrime = isPrimeByDivisorCount(n);
        System.out.println(n + " is prime: " + isPrime);
    }

    public static boolean isPrimeByDivisorCount(int n) {
        if (n <= 1) return false;

        int cnt = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                cnt++;
                if (n / i != i) cnt++;
            }
        }

        return cnt == 2; // prime numbers have exactly 2 divisors: 1 and itself
    }
    
}
