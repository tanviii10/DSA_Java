import java.util.Scanner;

public class invertedabcHalfTri {
    public static int pattern(int n){
         for (int i = 0; i <n; i++) {
            for (char ch='A'; ch<='A'+(n-i-1);ch++) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }

        //  for (int i = n; i >= 1; i--) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print((char)('A' + j) + " ");
        //     }
        //     System.out.println();
        // }
        return n;
     }

     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        pattern(n);
        sc.close();
    }
    
}
