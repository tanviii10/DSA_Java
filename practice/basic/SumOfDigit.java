import java.util.Scanner;
public class SumOfDigit {
    public static int sum(int n){
        int sum=0;
        int digit=0;
        while(n !=0 ){
            digit=n%10;
            sum=sum+ digit;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(sum(n));
    }
}
