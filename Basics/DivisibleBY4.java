import java.util.Scanner;

public class DivisibleBY4 {
    
    static boolean div(String str){

        int n=str.length();

        if(n==0) return false;

        if(n ==1 ){
           return ((str.charAt(0) - '0') % 4 == 0);
        }

        int last=((str.charAt(n-1)) - '0');
        int secLast=((str.charAt(n-2) )-'0');

        return (secLast *10+last) % 4 ==0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        System.out.println(div(str));
    }
}
