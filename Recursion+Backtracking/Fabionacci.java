import java.util.Scanner;
public class Fabionacci {

    public static int fab(int n){

        if(n == 0)
            return 0;

        if(n == 1)
            return 1;

        int ans= fab(n-1) + fab(n-2);

        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the nth term ");
        int n=sc.nextInt();

        System.out.println("nth term of Fabionacci is "+ fab(n));
        sc.close();
    } 
}
