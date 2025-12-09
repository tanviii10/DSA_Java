import java.util.Scanner;

public class factorial {

    public static void calfactorial(int n){

        if(n<1){
            System.out.println("invalid");
        }
        int fact=1;
        for (int i=n;i>=1; i--){
            fact=fact * i;
            
        }
        System.out.println(fact);
        return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        calfactorial(n);
        sc.close();
    }
    
}
