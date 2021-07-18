package ForLoop;
import java.util.Scanner;
public class Fibonaccci {

	public static void main(String[] args) {
		int a=0,b=1,c=0;
		System.out.println("The number :");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.print(a+" ");
		System.out.print(b+ " ");
		for (int i=0;i<n-2;i++) { 	//n-2 since we have print two number a and b at first.
			c=a+b;
			System.out.print(c+ " ");
			a=b;
			b=c;
		}
		
		s.close();
		
	}

}
