import java.util.Scanner;

public class CheackPalindrome {

    public static boolean check(String s){

        int left=0;
        int right= s.length() -1 ;

        while( left < right){
            if( s.charAt(left) != s.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        System.out.println(check(s));
        sc.close();
    }
    
}
