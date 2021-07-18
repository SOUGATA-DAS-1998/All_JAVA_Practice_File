import java.util.*;


public class Queue_Cf_Imple {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		
		//throws exception
//		q.add(50);
//		q.add(20);
//		
//		System.out.println(q);
//		q.remove();
//		System.out.println(q);
//		q.add(40);
//		q.element();
//		System.out.println(q);
		
		//Return null/false
		
		q.offer(30);
		q.offer(40);
		q.offer(50);
		
		System.out.println(q);
		q.poll();
		System.out.println(q);
		
		
		System.out.println(q.peek());
		
		
	}

}
