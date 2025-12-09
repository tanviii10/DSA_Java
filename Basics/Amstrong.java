import java.util.Scanner;

public class Amstrong {
    
   static int power(int x , int y){

        int result=1;
        for( int i=0; i < y ; i++){
            result = result * x;
        }
        return result;
   }

   static boolean calAms(int n){

        int digit =0;
        int t=n;
        while( t != 0){
            digit ++;
            t= t / 10; 
        }
        
        int sum=0, temp=n;

        while ( temp !=0 ){
            int r= temp % 10;
            sum = sum + power(r,digit);

            temp= temp/10;
        }

        return sum == n;
   }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(calAms(n));
    }
}
