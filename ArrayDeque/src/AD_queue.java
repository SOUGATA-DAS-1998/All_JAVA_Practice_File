import java.util.ArrayDeque;

public class AD_queue {

	public static void main(String[] args) {
		ArrayDeque<Integer> q = new ArrayDeque<>();
		
		q.offer(20);
		q.offer(80);
		q.offer(90);
		System.out.println(q);
		
		System.out.println(q.poll());
		
		
	}

}
