package LinkList_Creation;

public class linklist {
	 Node head;
	 
	 public void printlist() {
		Node n=head;
		while(n!=null) {
			System.out.println(n.data +" ");
			n=n.next;
		}
	 }
}

