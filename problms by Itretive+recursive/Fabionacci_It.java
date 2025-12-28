import java.util.Scanner;

public class Fabionacci_It {

    public static void calcFab(int n){
        int a=0;
        int b=1;
        System.out.println(a+ " ");

        if(n>1){
            for(int i=2 ; i<=n ; i++){
                System.out.println(b+" ");

                int temp=b;
                b=a+ b;
                a=temp;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

       calcFab(n);
       sc.close();
    }
    
}
