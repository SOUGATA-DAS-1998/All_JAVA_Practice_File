package Array_Rotation;

import java.util.Scanner;

public class ArrayRotate {

	public static void display(int a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	static void rotate(int a[], int n, int d) {

		for (int j = d; j < n; j++) {
			System.out.print(a[j] + " ");

		}
		 
		for (int i = 0; i < d; i++) {
			System.out.print(a[i] + " ");
		}

	}

	static void rotate_left(int a[], int n, int d) {
		for (int i = 0; i < d; i++) {
			int temp = a[0];
			for (int j = 0; j < n - 1; j++) {
				a[j] = a[j + 1];
			}
			a[n - 1] = temp;
		}

	}
// Q6--Given a sorted and rotated array, find if there is a pair with a given sum.
	static void find_pair_Sum(int a[],int n,int sum) {
		for (int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				
				if (a[i]+a[j]==sum) {
					System.out.println("the sum of "+a[i]+"+"+a[j]+" is found");
				}
			}
		}
		
		//return false;
	}
	
//Q7 Find maximum value of Sum( i*arr[i]) with only rotations on given array allowed	
	static void MaxSum(int a[],int n,int d) {
		int sum=0;
		for (int i=0;i<n;i++) {
			sum +=i*a[i];
		}
		System.out.println("\nthe maximum sum of the array is "+sum+" for "+d+" rotation");
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n = sc.nextInt();
		int a[] = new int[n];

		System.out.println("Enter the element in the array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the value upto which to rotate");
		int d = sc.nextInt();
		System.out.println("the array is");
		 rotate(a, n, d);
//		rotate_left(a, n, d);
//		display(a, n);
//		System.out.println("Enter the sumation to be found");
//		int sum =sc.nextInt();
		//find_pair_Sum(a,n,sum);
		
//		boolean fis=find_pair_Sum(a,n,sum);
//		sc.close();
//		if (fis==true) {
//			System.out.println("The sum of the number is found "+sum);
//		}
//			else {
//				System.out.println("The sum of the number is  not found "+sum);
//		
//			}
		
		MaxSum(a, n, d);
		}
		

	}


