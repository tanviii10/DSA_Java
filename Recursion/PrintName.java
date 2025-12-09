import java.util.Scanner;

class PrintName{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        print(1,n);
        sc.close();
    }

    public static void print(int i, int n){

        if(i>n){
            return ;
        }
         System.out.println("tanvi");
         print(i+1, n);
    }
}