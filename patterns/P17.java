import java.util.Scanner;

public class P17 {

    public static int pattern(int n){

        // for (int i = 1; i <= n; i++) {
        //     // Print leading spaces
        //     for (int s = 1; s <= n - i; s++) {
        //         System.out.print(" ");
        //     }

        //     // Print increasing letters
        //     for (int j = 0; j < i; j++) {
        //         System.out.print((char)('A'+j));
        //     }

        //     // Print decreasing letters
        //     for (int j = i - 2; j >= 0; j--) {
        //         System.out.print((char)('A' + j));
        //     }

        //     // New line after each row
        //     System.out.println();
        // }

        //spaces
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  "); // 2 spaces for better alignment
            }

            // Print increasing letters
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A' + j) + " ");
            }

            // Print decreasing letters
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((char) ('A' + j) + " ");
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
