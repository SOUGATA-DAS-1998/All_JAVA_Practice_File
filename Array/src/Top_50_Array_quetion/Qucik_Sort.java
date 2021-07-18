package Top_50_Array_quetion;

public class Qucik_Sort {

	static void swap(int a[],int i,int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	/*If we use pivot =mid then we have to return mid;
	 * else if we use pivot =first element then return j;
	 * 
	 */
	
	
	 static int  partition(int arr[], int low, int high)
	    {
		   int mid=low+(high-low)/2;
	        int pivot = arr[mid]; 
	        int i = low; // index of smaller element
	        int j=high;
	        while(i<=j)
	       // for (int j=low; j<high; j++)
	        {
	            // If current element is smaller than or
	            // equal to pivot
	            if(arr[i] <= pivot)
	            {
	                i++;
	            }
	            if(arr[j] >= pivot) {
	            j--;
	            }
	            if(i<j) {    

	            	swap(arr,i,j);
	            	
	            }
	        }
	  

	        swap(arr,j,low);
	       
	  
	        return mid;
	    }
	  
	  
	    /* The main function that implements QuickSort()
	      arr[] --> Array to be sorted,
	      low  --> Starting index,
	      high  --> Ending index */
	  static  void sort(int arr[], int low, int high)
	    {
	        if (low < high) //for checking atleast two elements in the aray
	        {
	            /* pi is partitioning index, arr[pi] is 
	              now at right place */
	            int pi = partition(arr, low, high);
	  
	            // Recursively sort elements before
	            // partition and after partition
	            
	            sort(arr, low, pi-1);
	            sort(arr, pi+1, high);
	            
	        }
	    
	  }
	    /* A utility function to print array of size n */
	    static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	    }
	  
	    // Driver program
	    public static void main(String args[])
	    {
	        int arr[] = {4,6,2,5,7,9,1,3};
	        int n = arr.length;
	  
	        
	        sort(arr, 0, n-1);
	  
	        System.out.println("sorted array");
	        printArray(arr);
	    }
	}
	
	
	