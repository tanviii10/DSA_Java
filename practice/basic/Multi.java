import java.util.*;

public class Multi {

    public static void multiply(int n){
        
        for(int i=1 ; i<= 10 ; i++){
            int res = n * i;
            System.out.println(res);
        }
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        multiply(n);
    }
}
