package estruturas;

public class LinkedList {

	private Node head;
	
	public LinkedList() {
		this.head = null;
	}
	
	public void addLast(int n) {
		if (isEmpty()) 
			this.head = n;
		else
			this.addLast(head, n);
	}
	
	private void addLast(Node node, int n) {
		if (node.next == null) {
			Node newNode = new Node(n);
			node.next = newNode;
			newNode.previous = node;
			return;
		} else {
			addLast(node.next, n);
		}
	}
	
	public void removeLast() {
		if (!isEmpty()) {
			if (this.head.next == null)
				this.head = null;
			else
				this.removeLast(this.head);
		}
	}
	
	private void removeLast(Node node) {
		if (node.next == null) 
			node.previous.next = null;
		else
			removeLast(node.next);
	}
	
	public boolean isEmpty() {
		return this.head == null;
	}
	
}
