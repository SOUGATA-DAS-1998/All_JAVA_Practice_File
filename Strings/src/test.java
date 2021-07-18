
public class test {
	
	static int get(int arr[],int n) {
		{
		       int max=arr[0];
		       int c=0;
		       for(int i=1;i <n;i++){
		           if(arr[i] > max){
		               max=arr[i];
		               c++;
		           }
		       }
		       if(c <= n-1)
		       return 1;
		       return 0;
		    }
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3};
		int n=arr.length;
		System.out.println(get(arr,n));
		
		
		
	}
}
