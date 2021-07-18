package if_else.switch_Case;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st value");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd value");
		int b=sc.nextInt();
		System.out.println("Mention the operation to be perform");
		sc.nextLine();// error resolve
		char operator=sc.nextLine().charAt(0); //error shows if we write string after integer input
		
		switch(operator) {
		case '+':
		{
			System.out.println("Addition of a and b is "+(a+b));
			break;
		}
		case '-':
		{
			System.out.println("Subtraction of a and b is "+(a-b));
			break;
		}
		case '*':
		{
			System.out.println("Multiplication of a and b is "+(a*b));
			break;
		}
		case '/':
		{
			System.out.println("Division of a and b is "+(a/b));
			break;
		}
		default:{
			System.out.println("Wrong input");
		}
		}

	}

}
