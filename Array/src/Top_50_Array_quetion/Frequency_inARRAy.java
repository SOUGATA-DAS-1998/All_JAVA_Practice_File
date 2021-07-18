package Top_50_Array_quetion;

public class Frequency_inARRAy {
	
	static void frequency(int a[],int n,int x) {
		int c=0;
		for(int i=0;i<n;i++) {
			if(a[i]==x) {
				c++;
			}
		}
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		int a[] = {5, 5, 5, 5, 5,12,4,5,8,7,9,5, 5, 5, 5, 5};
		int n=a.length;
		int x=5;
		frequency(a, n, x);
	}

}
