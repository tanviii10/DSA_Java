import java.util.Scanner;

class Problem{

    public static boolean isPrime(int n){
        if(n<= 1){
            return false;
        }

        int cnt=0;
        for(int i=1; i * i <=n ; i++){
            if(n % i == 0 ){
                cnt++;
                if( n / i != i ) 
                cnt ++;
            }   
        }
        return cnt == 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(n + " isPrime? : "+ isPrime(n));
        sc.close();
    }

}