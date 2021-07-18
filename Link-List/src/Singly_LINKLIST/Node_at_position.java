package Singly_LINKLIST;

class LinkList {
	Node head;

	public void insert_at_end(int newnode) {
		Node n3 = new Node(newnode);
		if (head == null) {
			head = new Node(newnode);
			return;
		}
		n3.next = null;

		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;

		}
		temp.next = n3;

	}

	public void traverseList() {

		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	public int getNth(int ind) {
		Node n = head;
		int count = 1;
		while (n != null) {
			if (count == ind)

				return n.data;
			count++;
			n = n.next;

		}
		return ind;
	}

}

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		next=null;
	}
}

public class Node_at_position {

	public static void main(String[] args) {
		LinkList l = new LinkList();
		
		l.insert_at_end(10);
		l.insert_at_end(26);
		l.insert_at_end(35);
		l.insert_at_end(45);
		l.insert_at_end(90);
		l.insert_at_end(60);

		l.traverseList();
		System.out.println("\n" + l.getNth(1));
	}

}
