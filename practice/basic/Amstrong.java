import java.util.Scanner;
public class Amstrong {
    public static boolean isAmstrong(int n){
        int original=n;
        int sum=0;
        int digit=0;

        while(n!=0){
            digit=n % 10;
            sum= sum + (digit*digit*digit);
            n=n/10;
        }
        if(original == sum){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(isAmstrong(n));
    }
}
