package DoublyLinkList;

public class DLL_Insertion {
	Node head;
	
	int length;
	
	static class Node{
		int data;
		Node next;
		Node prev;
		
		
		Node(int data){
			this.data=data;
			this.prev=null;
			this.next=null;
		}
	}
	
//	public DLL_Insertion() {
//		this.head=null;
//		this.length=0;
//	}
//	public boolean isEmpty() {
//		return length==0; //head== null;
//	}
//	public int length() {
//		return length;
//	}
	
	//Traverse the LinkList in Forward Direction
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
	
	//Traverse the list in Backward
	
	public void TraverceBackward(Node head) {
		while(head.next !=null) {   // traversing the head to the last node
			head=head.next;
		}
		
		Node temp= head;
			while(temp != null ) {
				System.out.print(temp.data +"--> ");
				temp=temp.prev;
			}
			System.out.println("null");
				
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
	
	
	
	public Node Insert_At_Begining(Node head, int val) {
		Node new_node = new Node(val);
		//Node n=head;
		if(head == null) {
			head= new_node;
			return head;
		}
		else {
			new_node.next= head;
			head = new_node;
			new_node.prev=null;
			return new_node;
		}
		
	}
	
	public Node Insert_At_index(Node head,int val,int ind) {
		Node new_node= new Node(val);
		if(ind == 0) {
			head=Insert_At_Begining(head, val);
			return head;
		}
		else {
			Node n= head;
			int count=1;
			while(count != ind) {
				n=n.next;
				count++;
			}
			new_node.next=n.next;
			n.next= new_node;
			new_node.prev=n;
		}
		return head;
	}
	
	public  Node Insert_Before_Last_Node(Node head, int val){
	        Node new_node = new Node(val);
	        if(head.next == null)
	            head = Insert_At_Begining(head, val);
	        else{
	            Node n = head;
	            while(n.next.next != null){
	                n  = n.next;
	            }
	            new_node.next = n.next;
	            n.next = new_node;
	            new_node.prev = n;
	        }
	        return head;
	    }
	
	
	
	public static void main(String[] args) {
		DLL_Insertion Dll= new DLL_Insertion();
		
//		Dll.head=new Node (10);
//		Node second= new Node(20);
//		Node third = new Node(30);
//		
//		Dll.head.next= second;
//		Dll.head.prev=null;
//
//		second.next= third;
//		second.prev=Dll.head;
//
//		third.next=null;
//		third.prev=second;
		
	
		
		Dll.head=Dll.Insert_At_end(Dll.head,20);
		Dll.head=Dll.Insert_At_end(Dll.head,30);
		Dll.head=Dll.Insert_At_end(Dll.head,40);
		Dll.head=Dll.Insert_At_end(Dll.head,50);
		Dll.head=Dll.Insert_At_end(Dll.head,60);
		Dll.TraverceForward(Dll.head);
		System.out.println();
		
		
		
		//Dll.TraverceBackward(Dll.head);
		
		
		
//		Dll.head=Dll.Insert_At_Begining(Dll.head,05);
//		Dll.head=Dll.Insert_At_Begining(Dll.head,02);
//		Dll.TraverceForward(Dll.head);
		
		
//		Dll.head= Dll.Insert_At_index(Dll.head, 90, 3);
//		Dll.TraverceForward(Dll.head);
	
		
		
		Dll.head=Dll.Insert_Before_Last_Node(Dll.head, 45);
		Dll.head=Dll.Insert_Before_Last_Node(Dll.head, 805);
		Dll.TraverceForward(Dll.head);
		

	}

}
