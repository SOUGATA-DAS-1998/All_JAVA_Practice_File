package ForLoop;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		int factorial=1;
		System.out.println("Enter the number ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>0;i--) {
			factorial =factorial*i;
		}
		System.out.println("The factorial of the number is "+ factorial);
		sc.close();
	}

}
