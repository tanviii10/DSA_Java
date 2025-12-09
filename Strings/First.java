import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name ");
        String name=sc.nextLine();

        System.out.println("your name is  "+ name);

        //length of string
        int s=name.length();
        System.out.println("lenght of give string is : "+s);

        //reverse string
        StringBuilder sb=new StringBuilder(name);

        String n=sb.reverse().toString();
        System.out.println("reverse is : "+n);

        sc.close();
    }
}
