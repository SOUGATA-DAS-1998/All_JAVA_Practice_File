package Top_50_Array_quetion;
//program to sort an array in ascending order

public class Bubble_Sort {
	
//	static void sorting(int a[],int n) {
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				if(a[i]<a[j]) {
//					int temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			
//			}
//			
//		}
//		
//		
//	}
	
	//Proper BUbble Sort
	
	static void Bubble(int a[],int n) {
		for(int i=0;i<n-1;i++) {
			boolean sort= true;
			for(int j=0;j<n-1-i;j++) {
				if(a[j+1]<a[j]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					sort=false;
				}
			}
			if(sort) break;
			
		}
		for(int item:a) {            //// for each loop 
			System.out.print(item+" ");
		}
	}
	
	
	
	
	
	static void display(int a[],int n) {
		 for(int i=0;i<n;i++) {
			 System.out.print(a[i]+" ");
		 }
	 }
	public static void main(String[] args) {
		int a[]={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		int n=a.length;
		//sorting(a, n);
		//display(a, n);
		Bubble(a, n);
	}

}
