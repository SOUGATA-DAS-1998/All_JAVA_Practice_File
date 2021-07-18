import java.util.ArrayDeque;

public class AD_stack {

	public static void main(String[] args) {
		ArrayDeque<Integer> s = new ArrayDeque<>();
		
		s.push(20);
		s.push(30);
		s.push(50);
		
		System.out.println(s);
		
		System.out.println(s.pop());

	}

}
