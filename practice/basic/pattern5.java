import java.util.Scanner;
public class pattern5{
	public static void print(int n){
		for(int i=1 ; i<=n ; i++){
			//space
			for(int j=1; j <= n-i ; j++){
				System.out.print(" ");
			}
			//star
			for(int j=1 ; j <= 2*i-1; j++){
				System.out.print("*");
			}
			//space
			for(int j=1 ; j <= n-i ; j++){
				System.out.print(" ");
			}
		System.out.println();
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		print(n);
	}
}