import java.util.Scanner;

public class mirrior {

    public static int pattern(int n){

         for (int i = 1; i <= n; i++) {
            // Print left number pattern
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print spaces in between
            int spaces = 2 * (n - i);
            for (int s = 1; s <= spaces; s++) {
                System.out.print("  "); // Two spaces for alignment
            }

            // Print right number pattern (same as left)
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
        return n;
    }

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        pattern(n);
        sc.close();
    }
    
    
}
