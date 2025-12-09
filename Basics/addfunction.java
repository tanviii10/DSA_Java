import java.util.Scanner;

class dfunction{
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);

    //     int a=sc.nextInt();
    //     int b=sc.nextInt();

    //     System.out.println(mul(a,b));
        
    // }

    // public static int mul(int a,int b){

    //     return a * b;
    // }


    public  void sum(int a,int b){
        int calsum=a+b;
        System.out.println(calsum);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        dfunction obj=new dfunction();
        obj. sum(a,b);
        sc.close();
    }
}