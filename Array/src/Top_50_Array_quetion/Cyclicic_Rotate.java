package Top_50_Array_quetion;

import java.util.Scanner;

public class Cyclicic_Rotate {

	static void reverce(int a[], int start, int end) {
		int temp;
		while (start < end) {
			temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;

		}
	}

	static void rotate(int a[], int n, int d) {
		d = d % n;

		reverce(a, 0, d-1 );
		reverce(a, d, n-1);
		reverce(a, 0, n - 1);
		
		
	////For Right rotate
/*
		reverce(arr, 0, n-d-1 );
		reverce(arr, n-d, n-1);
		reverce(arr, 0, n - 1);
*/
	}
		
		
	public static void display(int a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
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
		display(a, n);
	}

}
