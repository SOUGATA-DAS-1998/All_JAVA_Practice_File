
public class Priorrity_QUEUE {
	Node head;
	int front=-1;
	int rear=-1;
	void display() {
		Node n= head;
		
		while(n != null) {
			System.out.println(n.data +" "+n.prio);
			n=n.next;
		}
		System.out.println();
	}
	
	
	void Enqueue(int data,int prio) {
		Node new_node = new Node(data,prio);
		if(head == null) {
			head=new_node;
			rear++;
		}
		else {
			Node n=head;
			while(n.next != null) {
				n=n.next;
			}
			n.next =new_node;
			rear++;
		}
		
	}
	
		public void dequeue() {
			Node n=head;
		int min=n.prio;
		while(n.next != null) {
		if(min > n.next.prio) {
			min=n.next.prio;
			
		}
		n=n.next;
	}
		//System.out.println(min);
		
		if(head.prio == min) {
			head=head.next;
			
		}
		else {
			Node x=head;
			while(x.next.prio != min) {
				x=x.next;
			}
			x.next=x.next.next;
		}

	
		}
	static class Node{
		int data,prio;
		Node next;
		
		Node(int data,int prio){
			this.data=data;
			this.prio=prio;
		}
	}
	
	public static void main(String[] args) {
		
		Priorrity_QUEUE pq =new Priorrity_QUEUE();
		
		pq.Enqueue(20, 2);
		pq.Enqueue(30,3);
		pq.Enqueue(40,1);
		pq.Enqueue(50, 4);
		
		
		
		pq.display();
		pq.dequeue();
		pq.dequeue();
		pq.display();
	}

}
