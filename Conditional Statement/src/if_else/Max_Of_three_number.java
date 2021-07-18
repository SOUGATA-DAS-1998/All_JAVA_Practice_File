package if_else;

import java.util.Scanner;

public class Max_Of_three_number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
//		if(a>b && a>c) {
//			System.out.println(a);
//			
//		}
//		else if(b>a && b>c) {
//			System.out.println(b);
//		}
//		else {
//			System.out.println(c);
//		}
// ------------------------------------------------------------------		
//		if (a > b) {
//			if (a > c) {
//				System.out.println("The largest number is " + a);
//			} else {
//				System.out.println("The largest number is " + c);
//			}
//
//		} else {
//			if (b > c) {
//				System.out.println("The largest number is " + b);
//			} else {
//				System.out.println("The largest number is " + c);
//			}
//		}
// --------------------------------------------------------------------
		//ternery Operator
		int result=a>b? a>c? a:c : b>c? b:c;
		System.out.println("The lagest numbeer is "+result);
		s.close();
	}
	

}
