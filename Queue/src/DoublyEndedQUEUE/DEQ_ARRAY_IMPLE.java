package DoublyEndedQUEUE;

public class DEQ_ARRAY_IMPLE {
	int que[], Front, Rear, size;

	public DEQ_ARRAY_IMPLE(int sizeofqueue) {
		que = new int[sizeofqueue];
		Front = -1;
		Rear = -1;
		size = 0;
	}

	boolean isEmpty() {

		return Front == Rear;
	}

	boolean isFull() {
		return Rear == que.length - 1;
	}

	public void Enqueue_from_rear(int val) {
		if (!isFull()) {

			Rear++;
			que[Rear] = val;

			size++;
			System.out.print(que[Rear] + " ");

		} else {
			System.out.println("Queue is full");
		}
	}

	public void Dequeue_from_front() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
		} else {
			Front++;
			// que[Front];
			//size--;
			// System.out.println(val);

		}
	}

	void Enqueue_from_Front(int data) {
		if (Front == -1 && Rear != que.length) {
			for (int i = Rear; i >= 0; i--) {
				que[i + 1] = que[i];
			}

			que[0] = data;
			Rear++;
		} else if (Front > -1 && Rear != que.length) {

			que[Front] = data;
			Front--;

		} else {
			System.out.println("The queue is full");
	}
	}

	void Dequeue_From_Rear() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}else {
		
		Rear--;
		}
	}
	
	void display() {
		if (Front == Rear) {
			System.out.println("quee is empty");
		}
		for (int i = Front + 1; i <= Rear; i++) {
			System.out.print(que[i] + " ");
		}
	}

	public static void main(String[] args) {
		DEQ_ARRAY_IMPLE da = new DEQ_ARRAY_IMPLE(3);

		da.Enqueue_from_rear(1);
		da.Enqueue_from_rear(2);
		da.Enqueue_from_rear(5);

		System.out.println();
		da.Dequeue_from_front();
		//da.Dequeue_from_front();

		//da.Enqueue_from_Front(50);

		//da.Enqueue_from_Front(70);
		
		
		//da.Dequeue_From_Rear();
		da.display();

	}

}
