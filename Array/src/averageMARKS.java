import java.util.Scanner;
public class averageMARKS {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students present in the calss: ");
		
		int number_of_Student=sc.nextInt();
		
		int marks[]=new int[number_of_Student];
		for (int i=0;i<marks.length;i++) {
			System.out.println("enter the marks of each student:"+ i);
			marks[i]=sc.nextInt();
		}
		
		for (int i=0;i<marks.length;i++) {
			
		 sum += marks[i];
		
	}
		int averageMarks=sum/number_of_Student;
		System.out.println("the average marks is :"+averageMarks);
	}
}
