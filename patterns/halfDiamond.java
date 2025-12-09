import java.util.Scanner;

public class halfDiamond {

    public static int pattern(int n){

        //1 based indexing
        for( int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1 ;j<=2*i-1 ; j++){
                System.out.print("*");
            }
            for(int j=1 ; j<=n-i; j++){
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
