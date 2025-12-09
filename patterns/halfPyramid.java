import java.util.Scanner;

public class halfPyramid {
    
    public static int pattern(int n){

        for(int i=1 ;i<=n ; i++){
            for(int j=1 ; j<=i ; j++){

                System.out.print("* ");
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
