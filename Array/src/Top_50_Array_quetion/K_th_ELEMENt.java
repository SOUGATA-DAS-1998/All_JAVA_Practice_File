package Top_50_Array_quetion;

public class K_th_ELEMENt {

	static void K_element_FromSort(int a[], int n, int k) {
		for (int i = 0; i < n - 1; i++) {
			boolean sort = true;
			for (int j = 0; j < n - 1 - i; j++) {
				if (a[j + 1] < a[j]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
					sort = false;
				}
			}
			if (sort)
				break;

		}
		for (int item : a) { //// for each loop
			System.out.print(item + " ");

		}
		System.out.println("\nThe k'th Smallest element is : " + a[k - 1]);
	}

	static void display(int a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		int a[] = { 7, 10, 4, 3, 20, 15 };
		int n = a.length;
		int k = 3;

		K_element_FromSort(a, n, k);
	}
}
