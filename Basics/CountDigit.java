import java.util.Scanner;

class CountDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(count(n));
        sc.close();

    } 

    public static int count(int n){

        int cnt=0;
        while(n>0){
            int lastDigit = n % 10;
            cnt=cnt+1;
            n = n / 10;
        }
        return cnt;
    }    
}