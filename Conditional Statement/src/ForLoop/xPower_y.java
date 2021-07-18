package ForLoop;
import java.util.Scanner;

public class xPower_y {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int n1=s1.nextInt();
		System.out.println("Enter the Second number: ");
		int n2=s1.nextInt();
		int result=1;
		for(int i=0;i<n2;i++) {
			result *=n1;
		}
		System.err.println("the power of the number is: "+result);
		s1.close();
	}

}
