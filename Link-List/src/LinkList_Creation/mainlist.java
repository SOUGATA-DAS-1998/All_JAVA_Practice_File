package LinkList_Creation;

public class mainlist {

	public static void main(String[] args) {
		
		linklist li= new linklist();
		
		li.head= new Node(1);
		Node second =new Node(2);
		Node third =new Node(4);
		
		
		li.head.next=second;
		second.next=third;
		
		li.printlist();
	}

}
