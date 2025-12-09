import java.util.Scanner;

public class SumOfNaturalNo_Re {

    public static void calcSum(int i, int n, int sum){
        if ( i == n){
            sum= sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        calcSum(i+1, n, sum);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        calcSum(1, n, 0);
        sc.close();
    }
}
