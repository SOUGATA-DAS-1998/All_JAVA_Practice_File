import java.util.*;
public class Stack_By_linkList {
	LinkedList<Integer> Sl =new LinkedList<>();
	int top=-1;
	
	void display() {
		if(top != -1) {
			for(int i =0;i<Sl.size();i++) {
				System.out.print(Sl.get(i)+ " ");
			}
		}
		else {
			System.out.println("Stack is empty");
		}
	}
	
	void push(int data)
	{
		Sl.add(data);
		top++;
		//System.out.println(Sl);
	}
	
	void pop() {
		if(top != -1) {
			Sl.removeLast();
			top--;
			//System.out.println(Sl);
		}
		else {
			System.out.println("Stack is empty");
		}
	}
	
	void peek() {
		System.out.println(Sl.getLast());
	}
	
	
	public static void main(String[] args) {
		//List<Integer> ll = new LinkedList<Integer>();
		Stack_By_linkList s = new Stack_By_linkList();
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.display();
		
		System.out.println();
		s.pop();
		s.pop();
		
		s.push(60);

		

		s.display();
		System.out.println();
		s.peek();
	}
}
