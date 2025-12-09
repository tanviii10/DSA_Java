import java.util.Scanner;

public class PowerOfNo_It {

    public static int calcpower(int x , int n){
        int result=1;
        for (int i=1; i<=n ; i++ ){
            result = result * x;
        }
        return result;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter value of x: ");
        int x=sc.nextInt();
        System.out.print("enter value of n: ");
        int n=sc.nextInt();

        System.out.println(x+" power "+ n+ " is :"+calcpower(x, n));
        
        sc.close();
    }
    
}
