

public class LinkLIST_QUEUE {

	Node front,Rear;
	
	void display() {
		Node n=front;
		while(n != null) {
			System.out.print(n.data +" ");
			n=n.next;
		}
		System.out.println();
	}
	
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			
		}
	}
	
	public void Enqueue(int val) {
		Node new_node = new Node(val);
		if(Rear == null) {
			front=Rear=new_node;
		}
		else {
			Rear.next=new_node;
			Rear=Rear.next;
		}
		
	}
	
	public void Dequeue() {
		if(front== null) {
			Rear=null;
			System.out.println("null");
		}
		Node temp= front;
		front=front.next;
		System.out.println(temp.data);
	}
	
	public static void main(String[] args) {
		
		LinkLIST_QUEUE lq=new LinkLIST_QUEUE();
		
		lq.Enqueue(10);
		lq.Enqueue(20);
		lq.Enqueue(30);
		lq.Enqueue(40);
		
		lq.display();
		lq.Dequeue();
		lq.display();
	}

}
