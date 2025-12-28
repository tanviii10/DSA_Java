import java.util.Scanner;

public class PowerOfNo_Re {
    public static int calcPower(int x, int n){
        if( n == 0){
            return 1;
        }
        if( x == 0){
            return 0;
        }

        int xPownm1= calcPower(x, n-1);
        int xPown= x * xPownm1;
        
        return xPown;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter value of x: ");
        int x=sc.nextInt();
        System.out.print("enter value of n: ");
        int n=sc.nextInt();

        System.out.println(calcPower(x, n));
        sc.close();
    }  
}
