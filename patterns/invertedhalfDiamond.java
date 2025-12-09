import java.util.Scanner;

public class invertedhalfDiamond {

      public static int pattern(int n){

        //1 based indexing
        for( int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int j=1 ;j<=2 * (n - i) + 1 ; j++){
                System.out.print("*");
            }
            for(int j=1 ; j<=i-1; j++){
                System.out.print(" ");
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
