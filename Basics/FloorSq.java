import java.util.Scanner;

public class FloorSq {

    static int flsq(int n){

        int res=1;
        while( res * res <=n ){
            res ++;
        }

        return res - 1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(flsq(n));
        sc.close();
    }
    
}
