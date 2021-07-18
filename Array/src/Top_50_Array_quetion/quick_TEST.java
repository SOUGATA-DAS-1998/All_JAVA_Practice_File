package Top_50_Array_quetion;

public class quick_TEST {

	static void swap(int a[],int i,int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	 static   int partition(int arr[], int low, int high)
	    {
	        int pivot = arr[(low+high)/2]; 
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
	            if(arr[j]>=pivot) {
	            j--;
	            }
	            if(i<j) {    
	            // swap arr[i] and arr[j]
//	                int temp = arr[i];
//	                arr[i] = arr[j];
//	                arr[j] = temp;
	            	swap(arr,i,j);

	            }
	        }
	  
//	        // swap arr[i+1] and arr[high] (or pivot)
//	        int temp = arr[j];
//	        arr[j] = arr[low];
//	        arr[low] = temp;
	        swap(arr,j,low);
	  
	        return j;
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
	
	
	