import java.util.Scanner;

public class Factorial_It {
    public static int calcFactorial(int n){
         
        int result=1;
        for(int i=n ; i>=1 ; i--){
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();

        System.out.println(calcFactorial(n));
        sc.close();
    }

}
