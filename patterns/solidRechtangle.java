import java.util.Scanner;

public class solidRechtangle {
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);

    //     int n=sc.nextInt();
       
    //     for( int i=1 ;i<=n ;i++){
    //         for(int j=1 ; j<=n ; j++){

    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    //     sc.close();
    // }

    public static int pattern(int m){

        for(int i=1 ; i<=m ; i++){
            for(int j=1 ;j<=m ;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        return m;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();

        pattern(m);
        sc.close();

    }

    
}
