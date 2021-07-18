package Singly_LINKLIST;



public class LinkedList<E> {
	Node<E> head;
	
	public static class Node <E>{
		int data;
		Node<E> next;
		Node(int data){
			this.data=data;
			next = null;
		}
	}

	
	void insert_at_first(int newdata) {
		
		Node<E> n1= new Node<E>(newdata);
		
		n1.next=head;
		head=n1;
	}
	
	void insert_after_node(Node<E> prev_node,int newnode) {
		Node<E> n2=new Node<E>(newnode);
		
		n2.next=prev_node.next;
		
		prev_node.next= n2;
	}
	
	
	void insert_at_end(int newnode) {
		Node<E> n3= new Node<E>(newnode);
		if(head==null) {
			head=n3;
			return;
		}
		n3.next=null;
		
		Node<E> temp=head;
		while(temp.next != null) {
			temp=temp.next;
			
			
		}
		temp.next=n3;
		
	}
	
	
//	public void delete_node(int key) {
//	Node temp=head;
//	Node prev=null;
//	
//	if(temp != null && temp.data==key ) {
//		head=temp.next; //change head
//		return;
//	}
//	while(temp != null && temp.data!=key ) {
//		prev=temp;
//		temp=temp.next;
//		
//	}
//	if(temp==null) {
//		return;
//	}
//	
//	prev.next = temp.next;
//}
	
	public void Delete_At_position(int x) {
		
		if(head==null) {
			System.out.println("invalid input");
		}
		

	   if(x==0){
	       //Node temp= head;
	       head=head.next;
	      // temp.next=null;
	       return ;
	       
	   }
	   else{
	       Node<E> n=head;
	       int count=1;
	       while(count != x){
	           n=n.next;
	           count++;
	       }

	       n.next=n.next.next;
	       return ;
	   }
}
	
	public void Delete_At_last() {
		Node<E> n= head;
		while(n.next.next != null) {
			n=n.next;
		}
		n.next=null;
	}
	public void Delete_At_first() {
		head=head.next;
	}
	public void traverseList() {
		
		Node<E> n= head;
		while(n!=null) {
			System.out.print(n.data +" ");
			n= n.next;
		}
	}
	
	   

	
	
	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<>();
		
		l1.head=new Node<Integer>(400);
		Node<Integer> second = new Node<Integer>(500);
		Node<Integer> third = new Node<> (600);
		
		l1.head.next= second;
		second.next=third;
		
		
		
		
		
		//l1.insert_at_first(12); ///12 1 2 3 
		
		l1.insert_after_node(second,45 ); //12 1 2 45 3
		
		//l1.insert_at_end(50);  //1 2 3 50
		l1.traverseList(); 
		System.out.println();
		//l1.delete_node(1);
		
		l1.Delete_At_position(3);
		l1.traverseList();
		
		
		
		//l1.Delete_At_last();
		//l1.traverseList();
		
		
		
//		l1.Delete_At_first();;
//		l1.traverseList();  //1 2 3

	}

}
