package Top_50_Array_quetion;
import java.util.Scanner;
public class Q1 {
	static void key_present(int a[],int n,int x,int key) {
	int c=0;
		for( int i=0;i<n;i=i+key) {
			for(int j=0;j<key;j++) {
				if(a[i+j]==x) {
					c++;
					break;
				}
			}
			
			
		}
		//System.out.println(c);
		int f=n/key;
		if(f==c) {
		System.out.println("yes"+c);
	}
		else {
			System.out.println("no"+c);
		}
}
			
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {3, 5, 2, 4, 3,10,  1, 7, 25, 11, 12, 3} ;
		int n=a.length;
//		System.out.println("Enter the size of the array");
//		int n=sc.nextInt();
//		int a[]=new int[n];
//		System.out.println("Enter the element in array");
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//		}
		System.out.println("Enter the element x to be found");
		int x=sc.nextInt();
		System.out.println("Enter the key element");
		int key=sc.nextInt();
		key_present(a, n, x, key);
	}

}
