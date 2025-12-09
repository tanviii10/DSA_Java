import java.util.Scanner;

public class P18 {

    public static int pattern(int n){

        for(int i=0; i<n; i++){
            for(char ch=(char) ('E'-i); ch<='E';ch++){

                System.out.print(ch+" ");

            }
            System.out.println();
        }
        return n;

    }

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        pattern(n);
        sc.close();
    }
    
}
