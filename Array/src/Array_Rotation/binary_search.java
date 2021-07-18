package Array_Rotation;

import java.util.Scanner;

public class binary_search {
//	public static int binarySearch(int a[],int x) {
//		int n=a.length;
//		int mid, low=0, high=n-1;
//		
//		while(low<high) {
//			 mid=(low+high)/2;
//			if(a[mid]==x) {
//				return a[mid];
//			}
//			else if(a[mid]<x) {
//				low=mid+1;
//			}
//			else {
//				high=mid-1;
//			}
//			
//		}
//		return -1;
//	}

	public static int binarySearch(int a[], int x, int low, int high) {
		// int n=a.length;
		int mid;

		if (low > high) {
			return -1;
		}
		mid = (low + high) / 2;
		if (a[mid] == x)
			return mid;
		if (a[mid] < x) {
			return binarySearch(a, x, mid + 1, high);
		}
		if (a[mid] > x) {
			return binarySearch(a, x, low, mid - 1);
		}

		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to be found");
		int a[] = { 1, 2, 3, 4, 5 };
		int x = sc.nextInt();
		sc.close();
		
		System.out.println("the number " + a[binarySearch(a, x, 0, a.length - 1)] + " is found at index "
				+ binarySearch(a, x, 0, a.length - 1));

	}

}
