package Top_50_Array_quetion;

public class Selection_Sort {

	static void sorting(int a[],int n) {
		for(int i=0;i<n-1;i++) {
			int minIndex=i;
			for(int j=i;j<n;j++) {
				if(a[j] < a[minIndex]) {
					minIndex=j;
				}
			}
			int temp=a[i];
			a[i]=a[minIndex];
			a[minIndex]=temp;
		}
	
	for(int item: a) {
	System.out.println(item+" ");	
	}
	}
	public static void main(String[] args) {
		int a[]= {36, 19, 29, 12, 5};
		int n=a.length;
		sorting(a, n);
				

	}

}
