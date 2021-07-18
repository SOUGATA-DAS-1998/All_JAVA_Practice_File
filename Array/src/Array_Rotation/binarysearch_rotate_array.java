package Array_Rotation;

import java.util.Scanner;

public class binarysearch_rotate_array {
	public static void display(int a[], int n) {
		for (int i = 0; i < n; i++) {
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
	

	static int binarySearch(int a[], int key, int low, int high) {
		if (low > high)
			return -1;
		int mid = (low + high) / 2;
		if (a[mid] == key)
			return mid;

		if (a[low] <= a[mid])
		{
			if (key >= a[low] && a[mid] >= key)
				return binarySearch(a, key, low, mid - 1);

			return binarySearch(a, key, mid + 1, high);

		}
		else {
		if (key >= a[mid] && key <= a[high])
			return binarySearch(a, key, mid + 1, high);

		return binarySearch(a, key, low, mid - 1);
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
		rotate_left(a, n, d);
		display(a, n);
		int i = binarySearch(a, 1, 0, n-1);
        if (i != -1)
            System.out.println("\nIndex: " + i);
        else
            System.out.println("Key not found");

	}

}
