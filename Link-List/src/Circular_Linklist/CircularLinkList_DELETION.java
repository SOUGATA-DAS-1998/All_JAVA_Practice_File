package Circular_Linklist;





public class CircularLinkList_DELETION {

	Node head;
	static class Node{
	    int data;
	    Node next;

	    Node(int data){
	        this.data = data;
	        next = null;
	    }
	}

	public void printLIST() {
		Node n= head;
		if(head !=null) {
		do {
			System.out.print(n.data +" ");
			n=n.next;
			
		}while(n != head);
	}
}
	
	
	public void Delete_At_First() {
		
		Node n=head;
		while(n.next != head) {
			n=n.next;
		}
		head=head.next;
		n.next=head;
	}
	
	public void Delete_At_Last() {
		Node n=head;
		while(n.next.next != head) {
			n=n.next;
		}
		n.next=head;
	}
	
	public void Delete_At_Index(int ind) {
		if(ind==0) {
			Node n=head;
			while(n.next != head) {
				n=n.next;
			}
			head=head.next;
			n.next=head;
		}
		else {
			Node n=head;
			int count=1;
			
			
			if(count != ind) {
				n=n.next;
				count++;
			}
			n.next=n.next.next;
		}
	}
	
	
	public void delete_at_value( int value){
        if(head.data == value)
        {
        	Node n=head;
			while(n.next != head) {
				n=n.next;
			}
			head=head.next;
			n.next=head;
        }
        else
        {
            Node n = head;
            while(n.next.data != value)
                n = n.next;
            n.next = n.next.next;
        }
	}
	
	
	public static void main(String[] args) {
		CircularLinkList_DELETION CD= new CircularLinkList_DELETION();
		
		CD.head = new Node(20);
		Node second = new Node(50);
		Node third = new Node(60);
		Node fourth = new Node(90);
		
		
		CD.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next=CD.head;
		
		CD.printLIST();
		
		System.out.println();
		
		//CD.Delete_At_First();
		
		//CD.Delete_At_Last();
		//CD.Delete_At_Index(2);
		CD.delete_at_value(90);
		CD.printLIST();
	}

}
