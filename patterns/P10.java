import java.util.Scanner;

public class P10 {

    public static int pattern(int n){

        for(int i=1; i<=2*n-1;i++){
            int stars=i;
            if(i>n)
                stars=2*n-i;
            for(int j=1 ; j<=stars;j++){
                System.out.print("*");
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
