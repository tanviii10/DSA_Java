import java.util.Scanner;

public class P19 {

    public static int pattern(int n){

         int totalRows = 2 * n; // Total rows = top half + bottom half

        for (int i = 1; i <= totalRows; i++) {
            int stars, spaces;

            // Top half
            if (i <= n) {
                stars = n - i + 1;         // Left and right stars
                spaces = 2 * (i - 1);      // Middle spaces
            }
            // Bottom half
            else {
                int k = i - n;
                stars = k;
                spaces = 2 * (n - k);
            }

            // Print left stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // Print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Print right stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // Move to next line
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
