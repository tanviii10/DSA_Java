import java.util.Scanner;

public class invertedhalfPyno {
     public static int pattern(int n){

        for(int i=1 ; i<=n ; i++){
            for( int j=1 ; j<=n-i+1; j++){
                System.out.print(j+" ");
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
