import java.util.*;

public class Fabionacci{

    public static void fab(int n){
        int first=0;
        int sec=1;
        System.out.print(first + " "+ sec+" ");

        for(int i=3 ; i<=n ; i++){

            int next = first + sec;
          
            System.out.print(next +" ");

            first=sec;
            sec=next;
        }    
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        fab(n);
    }
}