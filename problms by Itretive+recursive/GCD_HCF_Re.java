import java.util.Scanner;

public class GCD_HCF_Re {
     
    public static int calcGCD(int a ,int b){
        if (b==0){
            return a;
        }
        return calcGCD(b, a % b);
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

// gcdRecursive(48, 18)
// → gcdRecursive(18, 48 % 18 = 12)
// → gcdRecursive(12, 18 % 12 = 6)
// → gcdRecursive(6, 12 % 6 = 0)
// → return 6
