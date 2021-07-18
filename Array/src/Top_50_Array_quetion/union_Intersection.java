package Top_50_Array_quetion;

public class union_Intersection {

	public static void Union(int a[],int b[],int x,int y) {
		int i = 0, j = 0;
		int c[]=new int [x+y];
        while (i < x && j < y) {
            if (a[i] < b[j])
            	
                System.out.print(a[i++] + " ");
            else if (b[j] < a[i])
            	
                System.out.print(b[j++] + " ");
            else {
                System.out.print(b[j++] + " ");
                i++;
            }
      
        }
        
	  /* Print remaining elements of
    the larger array */
   while (i < x)
       System.out.print(a[i++] + " ");
   while (j < y)
       System.out.print(b[j++] + " ");

	}

	public static void Intersection(int a[], int b[], int x, int y) {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 3, 4, 5, 7 };
		int b[] = { 2, 3, 5, 6 };
		int x = a.length;
		int y = b.length;

		// Union(a, b, x, y);
		
		// Intersection(a, b, x, y);
	}

}
