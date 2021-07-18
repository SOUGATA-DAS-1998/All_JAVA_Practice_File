//package ForLoop;
//import java.util.Scanner;
//public class prime_Or_not {
//
//	public static void main(String[] args) {
//		System.out.println("Enter the number to check: ");
//		Scanner b=new Scanner(System.in);
//		int a=b.nextInt();
//		int c=0;
//		for (int i=1;i<=a;i++) {
//			if(a%i==0) {
//			c++;	
//			}
//			
//		}
//		if(c==2) {
//			System.out.println("The number "+a+" is prime");
//							
//			}
//		else {
//			System.out.println("The number "+a+" is not prime");
//		}
//
//	}
//
//}


package ForLoop;
import java.util.Scanner;
public class prime_Or_not {

	public static void main(String[] args) {
		System.out.println("Enter the number to check: ");
		Scanner b=new Scanner(System.in);
		int a=b.nextInt();
		boolean isPrime=true;
		//int c=0;
		for (int i=2;i*i<a;i++) { // important case 
			if(a%i==0) {
			isPrime=false;
			break;
			}
			
		}
		if(a<2)isPrime=false; 
		System.out.println("is prime number is "+isPrime);
		}

	}



