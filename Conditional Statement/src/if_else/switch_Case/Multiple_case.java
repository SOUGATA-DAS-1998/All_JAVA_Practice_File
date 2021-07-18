package if_else.switch_Case;
import java.util.Scanner;
public class Multiple_case {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Give the review");
		int review=sc.nextInt();
		switch(review) {
		case 1:
		case 2:
			System.out.println("Bad");
			break;
		case 3:
			System.out.println("Average");
			break;
		case 4:
		case 5:
			System.out.println("Good");
		}

	}

}
