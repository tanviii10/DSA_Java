import java.util.Scanner;

public class GCD_HCF_It {

    public static int calcGCD(int a, int b){
        
        while ( b != 0){
            int temp=b;
            b= a % b;
            a= temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of a: ");
        int a=sc.nextInt();
        System.out.print("enter the value of b: ");
        int b=sc.nextInt();

        System.out.println("GCD of a and b  is : "+ calcGCD(a, b));
        sc.close();
    }
  
}

// a = 48, b = 18
// temp = 18
// b = 48 % 18 = 12
// a = 18

// a = 18, b = 12
// temp = 12
// b = 18 % 12 = 6
// a = 12

// a = 12, b = 6
// temp = 6
// b = 12 % 6 = 0
// a = 6

// Loop ends → return 6
