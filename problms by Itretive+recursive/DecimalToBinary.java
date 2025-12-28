import java.util.Scanner;

public class DecimalToBinary {
    public static void dtob(int n){
        String b="";
        int t=n;
        while(t >0 ){
            int r=t % 2;
            t=t / 2;
            b= r + b;
        }
        System.out.println("decimal to binary of "+n+ " is : "+ b);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        dtob(n);
        sc.close();
    }
    
}
