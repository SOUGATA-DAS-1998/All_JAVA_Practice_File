package Top_50_Array_quetion;

public class Negative_Separate {

	static void negativeSort(int a[],int n) {
		int j=0;
		for(int i=0;i<n;i++) {
			if(a[i]<0) {
				if(i != j)
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			    }
				j++;
			}
		
		}
		for(int item: a) {
			System.out.print(item+" ");
		}
	}
	//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
	//########################################################################
	static void even_sort(int a[],int n) {
		int j=0;
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				if(i != j)
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			    }
				j++;
			}
		
		}
		for(int item: a) {
			System.out.print(item+" ");
		}
	}
	
	public static void main(String[] args) {
		//int a[]= { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		int a[]= {4,5,6,7,15,2,11,12};
		int n=a.length;
		//negativeSort(a, n);
		even_sort(a, n);
	}

}
