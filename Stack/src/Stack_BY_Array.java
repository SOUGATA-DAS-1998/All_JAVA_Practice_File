
public class Stack_BY_Array {

	int top, size,stack[];

	Stack_BY_Array(int size) {
		this.top = -1;
		this.size = size;
		 this.stack = new int[size];

	}

	boolean isEmpty() {
		return (top==-1);
	}
	boolean isFull() {
		return (top==size-1);
	}
	
	public void peek() {
		System.out.println("The peek Element is "+ stack[top]);
		//return stack[top];
	}
	
	
	
	
	
	public void push(int data)
	{
		if(! isFull()) {
		stack[++top]=data;
		System.out.println("Element pushed " +data);
	}
	else {
		System.out.println("Stack is Full");
	}
}
	
	
	public int pop()
	{
		if(! isEmpty()) {
			int data= stack[top];
			top--;
			System.out.println("Popped element is "+ data);
			return data;
		}else {
			System.out.println("Stack is empty :underflow");
			return -1;
		}
		
	}
	
	
	
	public void display() {
		for(int i=0;i<=top;i++){
			System.out.print(stack[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Stack_BY_Array SA = new Stack_BY_Array(5);
		
		SA.push(20);
		SA.push(30);
		SA.push(40);
		SA.push(50);
		SA.push(60);
		//SA.push(70);
		SA.display();
		
		SA.pop();
		SA.pop();
		SA.peek();
		SA.display();

	}

}
