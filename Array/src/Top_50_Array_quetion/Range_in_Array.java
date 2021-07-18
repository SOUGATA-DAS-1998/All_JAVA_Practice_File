package Top_50_Array_quetion;

public class Range_in_Array {

	static int getMin(int a[],int n,int i) {
		return (n==1) ? a[i]:Math.min(a[i],
					getMin(a,n-1,i+1));
	}

	static int getMax(int a[],int n,int i) {
		return (n == 1) ? a[i]:Math.max(a[i], getMax(a, n-1, i+1));
	}
	
	static void range(int a[],int n) {
		double max=getMax(a, n, 0);
		double min=getMin(a, n, 0);
		double  range_val=0;
		double coefficient_range=0;
		
		range_val=max-min;
		coefficient_range=(max-min)/(max+min);
		System.out.println("The Range is "+range_val);
		System.out.println("The Coefficient Range is "+coefficient_range);
	}
	
	
	public static void main(String[] args) {
		int a[]={5, 10, 15}  ;
		int n=a.length;
//		System.out.println("the maximum element is "+getMax(a, n, 0));
//		System.out.println("the minimum element is "+getMin(a, n, 0));
		range(a, n);
		
	}

}
