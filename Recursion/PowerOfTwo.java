import java.util.Scanner;

public class PowerOfTwo {

    public static int power(int n){

        //base case
        if(n==0){
            return 1;
        }

        int smallpro=power(n-1);
        int bigpro= 2 * smallpro;

        return bigpro;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter thr power");
        int n=sc.nextInt();

        System.out.println("2 to the power "+ n+ " is "+ power(n));
        sc.close();
    }
    
}
