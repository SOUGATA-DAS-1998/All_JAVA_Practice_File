package Top_50_Array_quetion;
//Write a program to reverse an array or string.
public class Reverce {

//	static void reverseArray(int a[],int n) {
//		for(int i=n-1;i>=0;i--) {
//			System.out.print(a[i]+" ");
//		}
//	}
	
	//Iterative way
	
	static void Iterative_Reverce(int a[],int n) {
		int start=0,end=n-1;
		while(start<end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		
		for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");
	}
//*************************************************
	
	//RECURSIVE WAY
//*************************************************
	 static void rverese_Array(int arr[], int start, int end)
	    {
	        int temp;
	        if (start >= end)
	            return;
	        temp = arr[start];
	        arr[start] = arr[end];
	        arr[end] = temp;
	        rverese_Array(arr, start+1, end-1);
	        
	        
	    }
	 static void display(int a[],int n) {
		 for(int i=0;i<n;i++) {
			 System.out.print(a[i]+" ");
		 }
	 }
	
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int n=a.length;
		//reverseArray(a, n);
		//Iterative_Reverce(a, n);
		rverese_Array(a,0,n-1);
		System.out.println("The reverse array is ");
		display(a, n);
	}

}
