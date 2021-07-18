
public class Circular_Queue {

	int arr[],front,rear,size;
	
	public Circular_Queue(int size) {
		arr=new int[size];
		front=rear=-1;
		this.size=arr.length;
	}
	
	public boolean isFull() {
		if((rear+1)%size == front)
			return true;
		return false;
	}
	
	public boolean isEmpty() {
		return front==rear;
	}
	
	
	public void Enqueue(int data) {
		if(isFull()) {
			System.out.println("Queue is full");			
		}
		else {
			rear=(rear+1)%size;
			arr[rear]=data;
			System.out.print(arr[rear]+" ");
		}
	}
	
	
	public void Dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		else {
			front=(front+1)%size;
			int val = arr[front];
			System.out.println(val);
		}
	}
	void display() {
		if(isEmpty()) {
			System.out.println("quee is empty");
		}
		for(int i=front+1;i<=rear;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void main(String[] args) {
		Circular_Queue cq =new Circular_Queue(5);
		
		cq.Enqueue(20);
		cq.Enqueue(30);
		cq.Enqueue(40);
		cq.Enqueue(50);
		cq.Enqueue(60);
		
		System.err.println();
		cq.Dequeue();
		cq.Dequeue();
		
		cq.display();

	}

}
