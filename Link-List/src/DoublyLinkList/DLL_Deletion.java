package DoublyLinkList;



public class DLL_Deletion {
	Node head;
	static class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data=data;
		}
	}
	public void TraverceForward(Node head) {
		if(head==null) {
			return;
		}
		else {
			Node temp= head;
			while(temp != null ) {
				System.out.print(temp.data +"--> ");
				temp=temp.next;
			}
			System.out.println("null");
				
		}
	}
	public Node Insert_At_end(Node head,int val) {
		Node new_node= new Node(val);
		Node n= head;
		if(head==null) {
			head= new_node;
			return head;
		}
		else {
			
			while(n.next != null) {
				n=n.next;
			}
			n.next=new_node;
			new_node.prev=n;
		}
		n=new_node;
		return head;
	}
	
	public Node Delete_At_first() {
		head=head.next;
		return head;
		
	}
	
	public Node Delete_At_last() {
		Node n=head;
		while(n.next.next != null) {
			n=n.next;
		}
		n.next=null;
		return head;
	}
	
	public Node Delete_At_Index(Node head,int ind) {
		if(ind == 0) {
			head=Delete_At_first();
			return head;
		}else {
			Node n=head;
			int c=1;
			while(c != ind) {
				n=n.next;
				c++;
			}
			n.next=n.next.next;
			n.next.prev=n;
			return head;
		}
	}
	
	public Node Delete_At_Value(Node head,int val) {
		if(head.data == val) {
			head=Delete_At_first();
			return head;
		}
		Node n= head;
		while(n.data != val) {
			n=n.next;
			
		}
		n=n.prev;
		n.next=n.next.next;
		n.next.prev=n;
		return head; 
		
	}
	
	
	public static void main(String[] args) {
		DLL_Deletion Dld = new DLL_Deletion();
		
		
		Dld.head=Dld.Insert_At_end(Dld.head,20);
		Dld.head=Dld.Insert_At_end(Dld.head,30);
		Dld.head=Dld.Insert_At_end(Dld.head,40);
		Dld.head=Dld.Insert_At_end(Dld.head,50);
		Dld.head=Dld.Insert_At_end(Dld.head,60);
		Dld.TraverceForward(Dld.head);
		
		
//		Dld.head= Dld.Delete_At_first();
//		Dld.head= Dld.Delete_At_first();
//		Dld.TraverceForward(Dld.head);
		
		
//		Dld.head= Dld.Delete_At_last();
//		Dld.TraverceForward(Dld.head);
		
		
//		Dld.head= Dld.Delete_At_Index(Dld.head, 2);
//		Dld.TraverceForward(Dld.head);
		
		
		Dld.head= Dld.Delete_At_Value(Dld.head,50);
		Dld.TraverceForward(Dld.head);
	}
}