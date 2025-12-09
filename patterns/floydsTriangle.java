import java.util.Scanner;

public class floydsTriangle {

     public static int pattern(int n){
          int no=1;
         for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(no+" ");
                no++;
      
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
