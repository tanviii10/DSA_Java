import java.util.Scanner;

public class PrimeInRange {

    public static boolean isPrime(int n){
        if(n<= 1){
            return false;
        }

        int cnt=0;
        for(int i=1; i * i <=n ; i++){
            if(n % i == 0 ){
                cnt++;
                if( n / i != i ) 
                cnt ++;
            }   
        }
        return cnt == 2;
    }

    public static void primeInRange( int L , int R){
        for ( int i=L ; i<=R ; i ++){
            if(isPrime(i)){
                System.out.println(i+ " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int L=sc.nextInt();
        int R=sc.nextInt();

        System.out.println("prime no from "+ L + " to "+ R +":");
        primeInRange(L, R);
        sc.close();
    }   
}
