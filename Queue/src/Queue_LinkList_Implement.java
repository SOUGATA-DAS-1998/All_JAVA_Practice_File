import java.util.LinkedList;

public class Queue_LinkList_Implement {
	
	LinkedList<Integer> ql = new LinkedList<>();
	
	public void enqueue(int val) {
		
		ql.add(val);
		System.out.println(ql);
		
	}

	
	public void Dequeue() {
		if(ql.size() !=0) {
			int val=ql.removeFirst();
			System.out.println(val);
			//System.out.println(ql);
		}else {
		System.out.println("The queue is empty");
	}
	}
	public static void main(String[] args) {
		Queue_LinkList_Implement q = new Queue_LinkList_Implement();
		
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		
		q.Dequeue();
		q.Dequeue();

	}

}
