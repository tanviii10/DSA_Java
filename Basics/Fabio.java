import java.util.Scanner;

public class Fabio {
    
    static int fab(int n){
         
        if( n <= 1) return n;
        
        int curr=0;
        int prv1=0;
        int prv2=1;

        for(int i=2; i<=n ; i++){

            curr= prv1 + prv2 ;

            prv1 = prv2 ;

            prv2=curr ;
        }
        return curr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(fab(n));
        sc.close();
    }
}
