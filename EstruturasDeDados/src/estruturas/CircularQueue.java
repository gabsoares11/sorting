package estruturas;

public class CircularQueue {

	int[] queue;
	int capacity;
	int head;
	int tail;
	
	public CircularQueue(int capacity) {
		this.queue = new int[capacity];
		this.capacity = capacity;
		this.head = -1;
		this.tail = -1;
	}
	
	public void add(int n) {
		if (isFull()) throw new RuntimeException();
		
		if (isEmpty()) {
			this.head = 0;
			this.tail = 0;
		} else {
			this.tail = (this.tail + 1) % this.capacity;
		}
		
		this.queue[tail] = n;
	}
	
	public int remove() {
		if (isEmpty()) throw new RuntimeException();
		
		int value = this.queue[head];
		
		if (this.head == this.tail) {
			this.head = -1;
			this.tail = -1;
		} else {
			this.head = (this.head + 1) % this.capacity;
		}
		
		return value;
	}
	
	public int head() {
		if (isEmpty()) throw new RuntimeException();
		
		return this.queue[head];
	}
	
	public boolean isEmpty() {
		return (this.head == -1) && (this.tail == -1);
	}
	
	public boolean isFull() {
		return ((this.tail + 1) % this.capacity) == this.head;
	}
	
	public static void main(String[] args) {
		
		CircularQueue q = new CircularQueue(10);
		
		assert q.isEmpty();
		q.add(2);
		q.add(5);
		q.add(7);
		q.remove();
		assert q.head() == 2;
		assert q.remove() == 2;
		assert q.head() == 5;
		
		q.add(3);
		q.add(1);
		q.add(10);
		q.add(9);
		q.add(4);
		q.add(6);
		
		assert q.remove() == 5;
		q.remove();
		assert q.head() == 7;
		
		q.add(2);
		assert !q.isFull();
		
		q.add(14);
		q.add(29);
		assert q.isFull();
	}
}
