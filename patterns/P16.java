import java.util.Scanner;

public class P16 {

     public static int pattern(int n){
         for (int i = 0; i <n; i++) {
            char ch=(char)('A' + i);
            for (int j=0;j<=i;j++) {
                System.out.print(ch+" ");
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
