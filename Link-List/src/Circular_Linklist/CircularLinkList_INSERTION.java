package Circular_Linklist;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		next = null;
	}
}

public class CircularLinkList_INSERTION {
	Node head;

	public void Insert_at_First(int value) {
		Node new_node = new Node(value);
		Node n = head;
		// LINKING THE LAST NODE TO NEW NODE
		while (n.next != head) {
			n = n.next;
		}
		n.next = new_node;
		// CHANGING THE HEAD
		new_node.next = head;
		head = new_node;

	}

	public void Insert_at_END(int value) {
		Node new_node = new Node(value);
		Node n = head;
		// LINKING THE LAST NODE TO NEW NODE
		while (n.next != head) {
			n = n.next;
		}
		n.next = new_node;

		new_node.next = head;

	}

	public void Insert_at_index(int value, int ind) {
		Node new_node = new Node(value);
		Node n = head;
		
		// For index 0
		if (ind == 0) {
			// LINKING THE LAST NODE TO NEW NODE
			while (n.next != head) {
				n = n.next;
			}
			n.next = new_node;
			// CHANGING THE HEAD
			new_node.next = head;
			head = new_node;

		}
		// For remaining indexes
		else {
			int c = 1;
			Node prev = head;
			while (c != ind) {
				prev = prev.next;
				c++;
			}
			new_node.next = prev.next;
			prev.next = new_node;
		}

	}

	// INSERT before last Node
	public void Insert_before_LastNode(int val) {
		Node new_node = new Node(val);
		Node n = head;
		if (head.next == null) {
			while (n.next != head) {
				n = n.next;
			}
			n.next = new_node;
			// CHANGING THE HEAD
			new_node.next = head;
			head = new_node;

		} else {
			n = head;
			while (n.next.next != head) {
				n = n.next;
			}
			new_node.next = n.next;
			n.next = new_node;
		}
	}

	public void printList() {
		Node temp = head;

		// If linked list is not empty
		if (head != null) {

			// Keep printing nodes till we reach the first node
			// again
			do {
				System.out.print(temp.data + " ");
				temp = temp.next;
			} while (temp != head);
		}
	}

	public static void main(String[] args) {

		CircularLinkList_INSERTION CL = new CircularLinkList_INSERTION();

		CL.head = new Node(20);
		Node second = new Node(50);
		Node third = new Node(60);
		Node fourth = new Node(90);
		Node fifth = new Node(80);

		CL.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = CL.head;

		// CL.printList();
		// CL.Insert_at_First(13);
		// CL.Insert_at_First(98);
		// CL.Insert_at_END(100);
		CL.printList();
		System.out.println();
		CL.Insert_at_index(45, 5);
		// CL.Insert_before_LastNode(84);
		CL.printList();
	}

}
