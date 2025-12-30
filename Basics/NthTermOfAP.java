import java.util.Scanner;

public class NthTermOfAP {

    public static int solve(int a1, int a2, int n){
 
        int NthTerm=a1;
        int d=a2-a1;
        for( int i=1; i<=n ; i++){
            NthTerm= NthTerm+ d;
        }
        return NthTerm;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int n=sc.nextInt();

        System.out.println("nth term of "+ n+ " is "+ solve(a1, a2, n));
        sc.close();
    }
    
}
