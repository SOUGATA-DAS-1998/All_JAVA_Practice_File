package Top_50_Array_quetion;

import java.util.Scanner;

public class MAX_MIn {

	static int getMin(int a[], int n) {
		int min = a[0];
		for (int i = 0; i < n; i++) {
			if (a[i]<min) {
				min = a[i];

			}

		}
		return min;
	}

	static int getMax(int a[], int n) {
		int max= a[0];
		for (int i = 0; i < n; i++) {
			if (a[i]>max) {
				max = a[i];

			}

		}
		return max;
	}

// BY using MATH.MIn function;
	//-----------------------------------------------------------
	
	static int MIN(int a[],int n) {
		int min=a[0];
		for(int i=0;i<n;i++) {
			min=Math.min(min,a[i]);
		}
		return min;
		
	}
	
//*****************************************************************
//####################################################
//RECURSIVE technique
	
	//&&&&&&&&&&&&&
	
	static int recurivegetMin(int arr[], int i, int n)
	{
	    // If there is single element, return it.
	    // Else return minimum of first element and
	    // minimum of remaining array.
	    return (n == 1) ? arr[i] : Math.min(arr[i],
	                        recurivegetMin(arr,i + 1 , n - 1));
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

//		System.out.println("The minimum number is" + getMin(a, n));
//		System.out.println("The maximum number is" + getMax(a, n));
		
		//System.out.println("The minimum number is" + recursivMIN(a, n));
		
		System.out.println("The minimum  number is" + recurivegetMin(a,0, n));
	}

}
