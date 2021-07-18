package Top_50_Array_quetion;

public class test {

	static void duplicate(int a[],int n) {
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					count++;
					
				}
			}
			if(count!=0)
				if(a[count]==a[i])
					break;
				System.out.println(a[i]+" ");
		}
		
	}
	
	
	public static void main(String[] args) {
		int a[]= {1,1,2,3,3,4,3,5,3};
		int n=a.length;
	     duplicate(a, n);
		//System.out.println(x);
	}

}
