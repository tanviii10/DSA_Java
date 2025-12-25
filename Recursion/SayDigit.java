import java.util.Scanner;

public class SayDigit {

    public static void say(int num, String arr[]){

        if(num == 0)
            return ;

        int digit= num % 10;
        num= num /10;

        say(num, arr);

        System.out.print(arr[digit]+" ");
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num : ");
        int num=sc.nextInt();

        String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

        say(num, arr);
        sc.close();
    }
}
