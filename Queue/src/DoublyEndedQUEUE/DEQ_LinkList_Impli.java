package DoublyEndedQUEUE;

//import DoublyLinkList.DLL_Insertion.Node;

public class DEQ_LinkList_Impli<E> {

	Node<E> head;

	public void addToFirst(E data) {
		Node<E> new_node = new Node<>(data);

		if (head == null) {
			head = new_node;

		} else {
			new_node.next = head;
			head.prev = new_node;
			head = new_node;

		}
	}

	public E removeLast() {
		if (head == null) {
			return null;
		}
		else {
			Node<E> n=head;
			while(n.next != null ) {
				n=n.next;
			}
			E val=n.data;
			n=n.prev;
			n.next=null;
			return val;
		}

	}

	
	public void addToLast(E data){
		Node<E> new_node = new Node<>(data);
		if(head ==null) {
			head =new_node;
		}
		else {
			Node<E> n=head;
			
			while(n.next != null) {
				n=n.next;
			}
			n.next=new_node;
			new_node.prev=n;
		}
	}
	
	
	public E removeFirst() {
		if(head == null) {
			return null;
		}
		else {
			E val =head.data;
			head = head.next;
			head.prev=null;
			
			return val;
		
		}
	}
	
	public static class Node<E> {
		E data;
		Node<E> next, prev;

		Node(E data) {
			this.data = data;
			this.next = this.prev = null;
		}

	}

	public void TraverceForward() {
		if (head == null) {
			return;
		} else {
			Node<E> temp = head;
			while (temp != null) {
				System.out.print(temp.data + "--> ");
				temp = temp.next;
			}
			System.out.println("null");

		}
	}

	public static void main(String[] args) {
		DEQ_LinkList_Impli<Integer> dlq = new DEQ_LinkList_Impli<>();

		dlq.addToFirst(20);
		dlq.addToFirst(50);
		dlq.addToFirst(60);
		
		dlq.TraverceForward();
		
		System.out.println(dlq.removeLast());
		dlq.TraverceForward();
		
		dlq.addToLast(2);
		dlq.addToLast(3);
		dlq.addToLast(4);
		dlq.TraverceForward();
		
		
		System.out.println(dlq.removeFirst());
		System.out.println(dlq.removeFirst());
		dlq.TraverceForward();
	}

}
