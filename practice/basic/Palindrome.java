import java.util.Scanner;
public class Palindrome {
    public static boolean isPalindrome(int n){

        int original=n;
        int rev=0;
        while(n!=0){
            rev=rev*10 + n%10;
            n=n/10;
        }
        if( original == rev){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(isPalindrome(n));
    }
}
