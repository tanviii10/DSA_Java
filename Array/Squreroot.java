import java.util.Scanner;

public class Squreroot {

    public static long sqrt(int n){

        long s=0;
        long e=n;
        long mid= s + ( e-s)/2;
        long ans=-1;

        while( s <= e){

            long sq= mid * mid;
            
            if( sq == n){
                return mid;
            }

            if( sq < n ){
                ans = mid;
                s = mid + 1;
            }
            else{
                e = mid -1;
            }
            mid= s + ( e-s)/2;

        }
        return ans;

    }

    public static double morePrecesion( int n, int precesion, long tempSoln){

        double factor=1;
        double ans= tempSoln;

        for( int i=0 ; i < precesion ; i++){
            factor =factor /10;

            for(double j=ans ; j * j <n ; j= j* factor){
                ans=j;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        long tempSoln= sqrt(n);

      System.out.println(" answer is : "+ morePrecesion(n, 3, tempSoln));
        sc.close();
    }
    
}
