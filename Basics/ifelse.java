import java.util.Scanner;

class ifelse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your marks:");
        int marks=sc.nextInt();

        if(marks<25){
            System.out.println("your grade is F");
        }
        else if(marks>=25 && marks<45){
            System.out.println("your grade is E");
        }
        else if(marks>=45 && marks<65){
            System.out.println("your grade is D");
        }
        else if(marks>=65 && marks<85){
            System.out.println("your garade is B");
        }
        else{
            System.out.println("your grade is A");

        }
        sc.close();
    }


}