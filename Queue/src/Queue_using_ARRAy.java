//import jdk.internal.misc.FileSystemOption;

public class Queue_using_ARRAy {

	int que[], head, rear, size;

	public Queue_using_ARRAy(int sizeofqueue) {
		que = new int[sizeofqueue];
		head = -1;
		rear = -1;
		size = 0;
	}

	boolean isEmpty() {

		return size == 0;
	}




	public void Enqueue(int val) {
		if (rear != que.length -1) {
			
			rear++;
			que[rear] = val;

			size++;
			System.out.print(que[rear]+ " ");

		} else {
			System.out.println("Queue is full");
		}
	}
	
	
	public void Dequeue() {
		if(size == 0) {
			System.out.println("Queue is empty");
		}
		else {
			head++;
//			int val =que[head];
//			size--;
//			System.out.println(val);
			
		}
	}

	void display() {
		if(head ==rear) {
			System.out.println("quee is empty");
		}
		for(int i=head+1;i<=rear;i++) {
			System.out.print(que[i]+ " ");
		}
	}
	
	public static void main(String[] args) {
		Queue_using_ARRAy qa = new Queue_using_ARRAy(5);

		qa.Enqueue(5);
		qa.Enqueue(20);
		qa.Enqueue(30);
		qa.Enqueue(40);
		//qa.display();
		System.out.println();
//		qa.Dequeue();
//		qa.Dequeue();
//		qa.Dequeue();
		qa.Dequeue();
		qa.display();
		
		
		
		
	}

}
