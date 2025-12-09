import java.util.Scanner;

public class KthDigit {

    static int calc(int a ,int b ,int k){

        int result=1;
        for(int i= 1 ;i <= b ; i++){
            result = result * a;
        }
       
        for( int i= 1 ; i <k ; i++){
            result = result / 10;
        }

        return result % 10;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int k=sc.nextInt();

        System.out.println(calc(a, b, k));
        sc.close();
    }
    
}
