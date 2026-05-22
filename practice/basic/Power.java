import java.util.Scanner;
public class Power {
    public static int power(int a,int b){

        int ans=1;
        for( int i=1 ; i<=b ;i++){
            ans=ans * a;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println(power(a,b));

    }
}
