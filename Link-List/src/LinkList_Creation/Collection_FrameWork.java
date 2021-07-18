package LinkList_Creation;
import java.util.*;

public class Collection_FrameWork {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of elemeents to be inserted");
		int n=sc.nextInt();
		System.out.println("enter the elemeent");
		for(int i=0;i<n;i++) {
			ll.add(sc.nextInt());
		}

		System.out.println(ll);
		
		System.out.println("Enter the value of index");
		int ind=sc.nextInt();
		int len=ll.size();
		int z=len-ind;
		int x=ll.get(z);
		sc.close();
		System.out.println(x);
	}

}
